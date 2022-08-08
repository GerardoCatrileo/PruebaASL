package cl.falabella.sge.aslplus.sge.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.falabella.sge.aslplus.sge.dao.OcencMapper;
import cl.falabella.sge.aslplus.sge.entity.Ocenc;
import cl.falabella.sge.aslplus.sge.service.OcencService;

@Service
public class OcencServiceImpl implements OcencService {
	
	@Autowired
	OcencMapper ocencMapper;

	@Override
	public Ocenc numOC() {
		Ocenc oc = ocencMapper.numOC();
		return oc;
	}

	@Override
	public List<Ocenc> numOCList() {
		return ocencMapper.getAllOC();
	}
	

	@Override
	public Ocenc getOCByNum(Integer numOC) {
		Ocenc oc = ocencMapper.getOCByNum(numOC);
		return oc;
	}

	@Override
	public List<Ocenc> getAllOrdenCompra() {
		return ocencMapper.getAllOrdenCompra();
	}
}
