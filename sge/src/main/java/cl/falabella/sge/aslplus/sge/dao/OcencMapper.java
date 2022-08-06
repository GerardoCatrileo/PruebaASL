package cl.falabella.sge.aslplus.sge.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Transactional;

import cl.falabella.sge.aslplus.sge.entity.Ocenc;

@Mapper
public interface OcencMapper {
	
	@Transactional(readOnly = true)
	public Ocenc numOC();
	
	@Transactional(readOnly = true)
	public List<Ocenc> numOCList();
}
