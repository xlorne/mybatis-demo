package com.example.mybatis.demo.mapper;

import com.example.mybatis.demo.domain.Test;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author lorne
 * @date 2019-09-26
 * @description
 */
@Mapper
public interface TestMapper {

    @Insert("insert into t_test(name) values(#{name})")
    int save(Test test);

    @Select("select * from t_test ")
    List<Test> findAll();

    @Update("update t_test set name = #{name} where id = #{id}")
    int updateName(Test test);

}
