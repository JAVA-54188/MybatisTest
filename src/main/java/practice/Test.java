package practice;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.example.Country;
import org.mybatis.example.CountryMapper;
import practice.dto.DTO1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String resource = "practice/mybatis-config.xml";
        InputStream inputStream;
        SqlSessionFactory sqlSessionFactory = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (SqlSession session = sqlSessionFactory.openSession()) {
//            Country country = session.selectOne("org.mybatis.example.CountryMapper.selectCountryByCode", code);
//            System.out.println(country.toString());
//            session.getMapper(CountryMapper.class);
//            CountryMapper mapper = session.getMapper(CountryMapper.class);
//            Country country1 = mapper.selectCountryByCode(code);
//            System.out.println(country1);
            List<DTO1> dto1List = session.selectList("practice.mapper.AnswersMapper.1");
            for (DTO1 dto1 :
                    dto1List
            ) {
                System.out.println(dto1);
            }
        }
    }
}
