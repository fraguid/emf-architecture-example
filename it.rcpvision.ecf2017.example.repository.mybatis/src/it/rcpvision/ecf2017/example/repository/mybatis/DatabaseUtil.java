package it.rcpvision.ecf2017.example.repository.mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.apache.ibatis.binding.MapperRegistry;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import it.rcpvision.ecf2017.example.repository.mybatis.mapper.CarMapper;
import it.rcpvision.ecf2017.example.repository.mybatis.mapper.PeopleMapper;
import it.rcpvision.ecf2017.example.repository.mybatis.mapper.ReservationMapper;

public class DatabaseUtil {

	private static SqlSessionFactory sqlSessionFactory;

	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	static {
		try {
			InputStream in = DatabaseUtil.class.getClassLoader().getResourceAsStream("sqlmap/mybatis-config.xml");
			Reader reader = new InputStreamReader(in);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			MapperRegistry mapperRegistry = sqlSessionFactory.getConfiguration().getMapperRegistry();
			mapperRegistry.addMapper(PeopleMapper.class);
			mapperRegistry.addMapper(CarMapper.class);
			mapperRegistry.addMapper(ReservationMapper.class);
			reader.close();
		} catch (IOException e) {
			throw new RuntimeException("Something bad happened while building the SqlMapClient instance.", e);
		}
	}

}