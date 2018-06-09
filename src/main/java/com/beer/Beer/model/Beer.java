package com.beer.Beer.model;

import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;

@Entity
@Table(name = "beers")
public class Beer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "brewery")
    private String brewery;

    @Column(name = "name")
    private String name;

    @Column(name = "style")
    private String style;

    @Column(name = "ABV")
    private float ABV;

    @Column(name = "IBU")
    private float IBU;

    protected Beer() {}

    public Beer(String brewery, String name, String style, float ABV, float IBU) {
        this.brewery = brewery;
        this.name = name;
        this.style = style;
        this.ABV = ABV;
        this.IBU = IBU;
    }

    public long getId() {
        return id;
    }

    public String getBrewery() {
        return brewery;
    }

    public void setBrewery(String brewery) {
        this.brewery = brewery;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public float getABV() {
        return ABV;
    }

    public void setABV(float ABV) {
        this.ABV = ABV;
    }

    public float getIBU() {
        return IBU;
    }

    public void setIBU(float IBU) {
        this.IBU = IBU;
    }
}
