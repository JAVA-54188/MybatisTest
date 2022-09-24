package practice;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.example.Country;
import org.mybatis.example.CountryMapper;

import java.io.IOException;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) {
        String resource = "org/mybatis/example/mybatis-config.xml";
        InputStream inputStream;
        SqlSessionFactory sqlSessionFactory = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }


        String code = "AFG";
        try (SqlSession session = sqlSessionFactory.openSession()) {
//            Country country = session.selectOne("org.mybatis.example.CountryMapper.selectCountryByCode", code);
//            System.out.println(country.toString());
//            session.getMapper(CountryMapper.class);
            CountryMapper mapper = session.getMapper(CountryMapper.class);
            Country country1 = mapper.selectCountryByCode(code);
            System.out.println(country1);
        }
    }
}
