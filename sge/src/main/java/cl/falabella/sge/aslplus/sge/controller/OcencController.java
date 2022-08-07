package cl.falabella.sge.aslplus.sge.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.falabella.sge.aslplus.sge.entity.Ocenc;
import cl.falabella.sge.aslplus.sge.service.OcencService;

@RestController
public class OcencController {
	
	@Autowired
	OcencService ocencService;
	
	@PostMapping(value = "/numOC", consumes = "application/json", produces = "application/json")
	public Ocenc numOC() {
		Ocenc oc = ocencService.numOC();
		return oc;
	}
	
	
	@PostMapping(value = "/numOCList", consumes = "application/json", produces = "application/json")
	public List<Ocenc> numOCList() {
		
		return ocencService.numOCList();
	}
	
	@PostMapping(value = "/getOCByNum", consumes = "application/json", produces = "application/json")
	public Ocenc getOCByNum(@PathParam("numOC") Integer numOC) {
		Ocenc oc = ocencService.getOCByNum(numOC);
		return oc;
	}
	
	

}