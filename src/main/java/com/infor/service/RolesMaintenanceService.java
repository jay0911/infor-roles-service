package com.infor.service;

import java.util.List;

import com.infor.dto.MaintenanceDTO;
import com.infor.models.InforRoles;

public interface RolesMaintenanceService {
	public List<InforRoles> selectRoles();	
	public void deleteRole(MaintenanceDTO dto);
	public void saveRole(MaintenanceDTO dto);
}	
