package com.infor.dao;

import java.util.List;

import com.infor.dto.MaintenanceDTO;
import com.infor.models.InforRoles;

public interface RolesMaintananceDao {

	public List<InforRoles> selectRoles();
	
	public void deleteRole(MaintenanceDTO dto);
	public void saveRole(InforRoles roles);
	
}
