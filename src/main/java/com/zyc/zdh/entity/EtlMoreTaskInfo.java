package com.zyc.zdh.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Table
public class EtlMoreTaskInfo {

    @Id
    @Column
    private String id;

    private String etl_ids;

    private String etl_context;

    private String etl_sql;

    private String drop_tmp_tables;

    //输出数据源id
    private String data_sources_choose_output;
    //输出数据源类型
    private String data_source_type_output;
    //输出数据源表名
    private String data_sources_table_name_output;
    //输出数据源文件名
    private String data_sources_file_name_output;
    //文件类型
    private String file_type_output;
    //文件编码
    private String encoding_output;
    //文件分割符
    private String sep_output;
    //输出数据源其他参数
    private String data_sources_params_output;
    //输出数据源删除条件
    private String data_sources_clear_output;

    private String owner;

    private Timestamp create_time;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEtl_ids() {
        return etl_ids;
    }

    public void setEtl_ids(String etl_ids) {
        this.etl_ids = etl_ids;
    }

    public String getEtl_context() {
        return etl_context;
    }

    public void setEtl_context(String etl_context) {
        this.etl_context = etl_context;
    }

    public String getEtl_sql() {
        return etl_sql;
    }

    public void setEtl_sql(String etl_sql) {
        this.etl_sql = etl_sql;
    }

    public String getData_sources_choose_output() {
        return data_sources_choose_output;
    }

    public void setData_sources_choose_output(String data_sources_choose_output) {
        this.data_sources_choose_output = data_sources_choose_output;
    }

    public String getData_source_type_output() {
        return data_source_type_output;
    }

    public void setData_source_type_output(String data_source_type_output) {
        this.data_source_type_output = data_source_type_output;
    }

    public String getData_sources_table_name_output() {
        return data_sources_table_name_output;
    }

    public void setData_sources_table_name_output(String data_sources_table_name_output) {
        this.data_sources_table_name_output = data_sources_table_name_output;
    }

    public String getData_sources_file_name_output() {
        return data_sources_file_name_output;
    }

    public void setData_sources_file_name_output(String data_sources_file_name_output) {
        this.data_sources_file_name_output = data_sources_file_name_output;
    }

    public String getData_sources_params_output() {
        return data_sources_params_output;
    }

    public void setData_sources_params_output(String data_sources_params_output) {
        this.data_sources_params_output = data_sources_params_output;
    }

    public String getData_sources_clear_output() {
        return data_sources_clear_output;
    }

    public void setData_sources_clear_output(String data_sources_clear_output) {
        this.data_sources_clear_output = data_sources_clear_output;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Timestamp getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Timestamp create_time) {
        this.create_time = create_time;
    }

    public String getDrop_tmp_tables() {
        return drop_tmp_tables;
    }

    public void setDrop_tmp_tables(String drop_tmp_tables) {
        this.drop_tmp_tables = drop_tmp_tables;
    }

    public String getFile_type_output() {
        return file_type_output;
    }

    public void setFile_type_output(String file_type_output) {
        this.file_type_output = file_type_output;
    }

    public String getEncoding_output() {
        return encoding_output;
    }

    public void setEncoding_output(String encoding_output) {
        this.encoding_output = encoding_output;
    }

    public String getSep_output() {
        return sep_output;
    }

    public void setSep_output(String sep_output) {
        this.sep_output = sep_output;
    }
}
