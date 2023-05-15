package pers.liuliang.springbootmybatis.domain;

import java.util.Date;

public class Album {
    private long id;
    private String name;
    private long partner_id;
    private String partner_company_name;
    private Date create_date;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPartner_id() {
        return partner_id;
    }

    public void setPartner_id(long partner_id) {
        this.partner_id = partner_id;
    }

    public String getPartner_company_name() {
        return partner_company_name;
    }

    public void setPartner_company_name(String partner_company_name) {
        this.partner_company_name = partner_company_name;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", partner_id=" + partner_id +
                ", partner_company_name='" + partner_company_name + '\'' +
                ", create_date=" + create_date +
                '}';
    }
}
