package com.itheima.dao;

import com.itheima.domain.iteams;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface IteamsDao {
    @Select("SELECT * FROM items where id = #{id}")
    public iteams findById(int id);
}
