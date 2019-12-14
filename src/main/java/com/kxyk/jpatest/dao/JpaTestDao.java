package com.kxyk.jpatest.dao;

import com.kxyk.jpatest.pojo.Custom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaTestDao extends JpaRepository<Custom,Long> {

}
