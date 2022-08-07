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
	
	@ResultMap("OcencMap")
	@ResultType(Ocenc.class)
	@Select.List(value = { @Select("SELECT TO_NUMBER(C_OCENC) AS C_OCENC, C_CANAL, C_NEGOCIO  FROM asl_ocenc WHERE c_negocio = 'F' AND c_canal = 'I'") })
	public List<Ocenc> getAllOC();

	
	@Transactional(readOnly = true)
	public Ocenc getOCByNum (Integer numOC);
}
