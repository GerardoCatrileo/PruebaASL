package cl.falabella.sge.aslplus.sge.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.transaction.annotation.Transactional;

import cl.falabella.sge.aslplus.sge.entity.Ocenc;

@Mapper
public interface OcencMapper {
	
	@Transactional(readOnly = true)
	public Ocenc numOC();
	
	@ResultType(Ocenc.class)
	public List<Ocenc> numOCList();
	

	@ResultType(Ocenc.class)
	@Select.List(value = { @Select("SELECT TO_NUMBER(C_OCENC) AS numOC, C_CANAL AS canal, C_NEGOCIO as negocio  FROM asl_ocenc WHERE c_negocio = 'F' AND c_canal = 'I'") })
	public List<Ocenc> getAllOC();

	
	@Transactional(readOnly = true)
	public Ocenc getOCByNum (Integer numOC);
	
	@ResultMap("OcencMap")
	@Select.List(value = { @Select("SELECT TO_NUMBER(C_OCENC) AS C_OCENC, C_CANAL, C_NEGOCIO, A_ORDEN  FROM asl_ocenc WHERE c_negocio = 'F' AND c_canal = 'I' AND D_COLOCACION BETWEEN TO_DATE('2021-01-01','yyyy-mm-dd') AND TO_DATE('2021-06-01','yyyy-mm-dd') ") })
	public List<Ocenc> getAllOrdenCompra();
}
