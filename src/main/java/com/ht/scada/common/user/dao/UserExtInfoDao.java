package com.ht.scada.common.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ht.scada.common.user.entity.UserExtInfo;
import org.springframework.data.jpa.repository.Query;


public interface UserExtInfoDao extends JpaRepository<UserExtInfo, Integer> {
	public UserExtInfo findByRealName(String realName);
	@Query("select u from UserExtInfo u where u.user.id=?1")
	public UserExtInfo findByUserID(int id);
}