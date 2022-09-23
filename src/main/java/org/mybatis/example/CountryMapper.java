package org.mybatis.example;


public interface CountryMapper {
    Country selectCountryByCode(String code);
}
