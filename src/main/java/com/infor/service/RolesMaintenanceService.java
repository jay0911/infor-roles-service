package com.infor.service;

import java.util.List;

import com.infor.dto.UserMaintenanceDTO;
import com.infor.models.InforRoles;

public interface RolesMaintenanceService {
	public List<InforRoles> selectRoles();	
	public void deleteRole(UserMaintenanceDTO dto);
	public void saveRole(UserMaintenanceDTO dto);
}	
