package com.infor.iservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infor.dao.RolesMaintananceDao;
import com.infor.dto.MaintenanceDTO;
import com.infor.models.InforRoles;
import com.infor.models.InforUser;
import com.infor.service.RolesMaintenanceService;
/**
 * 
 * @author joliveros
 * @see InforUser
 * @since 1.0
 */
@Service
public class RolesMaintenanceIService implements RolesMaintenanceService{
	
	@Autowired
	private RolesMaintananceDao md;

	@Override
	public List<InforRoles> selectRoles() {
		// TODO Auto-generated method stub
		return md.selectRoles();
	}

	@Override
	public void deleteRole(MaintenanceDTO dto) {
		// TODO Auto-generated method stub
		md.deleteRole(dto);
	}

	@Override
	public void saveRole(MaintenanceDTO dto) {
		// TODO Auto-generated method stub
		InforRoles role = new InforRoles();
		role.setRole(dto.getPosition());
		md.saveRole(role);
	}

}
