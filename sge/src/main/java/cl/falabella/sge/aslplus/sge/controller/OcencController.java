package cl.falabella.sge.aslplus.sge.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.falabella.sge.aslplus.sge.dao.OcencMapper;
import cl.falabella.sge.aslplus.sge.entity.Ocenc;

@RestController
public class OcencController {
	
	@Resource
	@Autowired
	private OcencMapper ocencMapper;
	
	@PostMapping(value = "/numOC", consumes = "application/json", produces = "application/json")
	public Ocenc numOC() {
		Ocenc oc = ocencMapper.numOC();
		return oc;
	}
	
	
	@PostMapping(value = "/numOCList", consumes = "application/json", produces = "application/json")
	public List<Ocenc> numOCList() {
		List<Ocenc> oc = ocencMapper.numOCList();
		return oc;
	}

}