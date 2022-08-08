package cl.falabella.sge.aslplus.sge.service;

import java.util.List;

import cl.falabella.sge.aslplus.sge.entity.Ocenc;


public interface OcencService {
	
	public Ocenc numOC();
	public List<Ocenc> numOCList();
	public Ocenc getOCByNum (Integer numOC);
	public List<Ocenc> getAllOrdenCompra();

}
