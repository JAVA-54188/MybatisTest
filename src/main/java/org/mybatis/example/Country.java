package org.mybatis.example;

public class Country {
    private String code;
    private String name;
    private String continent;
    private String Region;
    private Float surfaceArea;
    private Long inDepYear;
    private Integer population;

    @Override
    public String toString() {
        return "org.mybatis.example.Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                ", Region='" + Region + '\'' +
                ", surfaceArea=" + surfaceArea +
                ", inDepYear=" + inDepYear +
                ", population=" + population +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public Float getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(Float surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public Long getInDepYear() {
        return inDepYear;
    }

    public void setInDepYear(Long inDepYear) {
        this.inDepYear = inDepYear;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }
}
