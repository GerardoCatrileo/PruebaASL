package cl.falabella.sge.aslplus.sge.dao;

import org.apache.ibatis.annotations.Mapper;

import cl.falabella.sge.aslplus.sge.entity.Ocenc;

@Mapper
public interface OcencMapper {
	public Ocenc numOC();
}
