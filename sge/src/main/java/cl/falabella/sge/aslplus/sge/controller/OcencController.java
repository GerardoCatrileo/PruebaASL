package cl.falabella.sge.aslplus.sge.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.falabella.sge.aslplus.sge.dao.OcencMapper;
import cl.falabella.sge.aslplus.sge.entity.Ocenc;

@RestController
public class OcencController {
	
	@Resource
	OcencMapper ocenc;
	
	@GetMapping("/numOC")
	public Ocenc numOC() {
		System.out.println(ocenc.numOC().getC_ocenc());
		return ocenc.numOC();
	}

}