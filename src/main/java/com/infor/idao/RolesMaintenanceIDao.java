package com.infor.idao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import com.infor.dao.RolesMaintananceDao;
import com.infor.dto.UserMaintenanceDTO;
import com.infor.models.InforRoles;

@Repository
@Transactional
public class RolesMaintenanceIDao extends HibernateDaoSupport implements RolesMaintananceDao{

	private static final String ROLES_FETCH_HQL = "from InforRoles";
	private static final String ROLES_DELETE_HQL = "delete from InforRoles where role=:role";

	@SuppressWarnings("unchecked")
	@Override
	public List<InforRoles> selectRoles() {
		// TODO Auto-generated method stub
		return customSelectQuery(ROLES_FETCH_HQL)
				.list();
	}

	@Override
	public void deleteRole(UserMaintenanceDTO dto) {
		// TODO Auto-generated method stub
		Query query = getSessionFactory().createQuery(ROLES_DELETE_HQL);
	    query.setParameter("role", dto.getPosition());
	    int deleted = query.executeUpdate();
	    System.out.println("Deleted: " + deleted + " user(s)");
	}

	@Override
	public void saveRole(InforRoles roles) {
		// TODO Auto-generated method stub
		getSessionFactory().save(roles);
	}

}
