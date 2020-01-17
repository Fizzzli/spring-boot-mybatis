package com.fizz.tutorial.dal.mapper;

import com.fizz.tutorial.dal.model.TestDO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TestMapper {

    @Select("SELECT * FROM test WHERE id = #{id}")
    TestDO selectById(@Param("id") Long id);

    @Insert("INSERT INTO test(a, b, c) VALUES (#{a}, #{b}, #{c})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    Long insert(TestDO testDO);

}
