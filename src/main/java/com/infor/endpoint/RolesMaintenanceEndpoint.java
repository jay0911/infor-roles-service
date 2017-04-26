package com.infor.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infor.dto.UserMaintenanceDTO;
import com.infor.models.AjaxResponseBody;
import com.infor.service.RolesMaintenanceService;

@RestController
public class RolesMaintenanceEndpoint {

	@Autowired
	private RolesMaintenanceService s;

	@GetMapping("/getroles")
	public UserMaintenanceDTO getRoles(){
		UserMaintenanceDTO dto = new UserMaintenanceDTO();
		dto.setInforRoles(s.selectRoles());
		return dto;
	}

	@PostMapping("/deleterole")
	public AjaxResponseBody deleterole(@RequestBody UserMaintenanceDTO dto){
		AjaxResponseBody response = new AjaxResponseBody();
		try{
			s.deleteRole(dto);
			response.setMsg("success");
			response.setCode("200");
		}catch(Exception e){
			response.setMsg("failed");
			response.setCode("400");
		}
		return response;
	}
	
	@PostMapping("/saverole")
	public AjaxResponseBody saverole(@RequestBody UserMaintenanceDTO dto){
		AjaxResponseBody response = new AjaxResponseBody();
		try{
			s.saveRole(dto);
			response.setMsg("success");
			response.setCode("200");
		}catch(Exception e){
			response.setMsg("failed");
			response.setCode("400");
		}
		return response;
	}

}
