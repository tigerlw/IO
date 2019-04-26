//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.04.26 时间 09:55:42 AM CST 
//


package com.ucloudlink.xml.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notepads" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="step_error_handling" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="slave-step-copy-partition-distribution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="slave_transformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attributes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="info" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="extended_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="trans_version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="trans_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="directory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="parameters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="size_rowset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sleep_time_empty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sleep_time_full" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="unique_connections" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="feedback_shown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="feedback_size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="using_thread_priorities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="shared_objects_file" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="capture_step_performance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="step_performance_capturing_delay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="step_performance_capturing_size_limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="dependencies" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="partitionschemas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="clusterschemas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="created_user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="created_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="modified_user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="modified_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="key_for_session_key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="is_key_private" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="log" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="trans-log-table" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="connection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="schema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="table" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="size_limit_lines" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="interval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="timeout_days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element ref="{}field" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="perf-log-table" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="connection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="schema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="table" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="interval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="timeout_days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element ref="{}field" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="channel-log-table" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="connection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="schema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="table" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="timeout_days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element ref="{}field" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="step-log-table" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="connection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="schema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="table" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="timeout_days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element ref="{}field" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="metrics-log-table" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="connection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="schema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="table" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="timeout_days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element ref="{}field" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="maxdate" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="connection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="table" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="field" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="maxdiff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="slaveservers" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="slaveserver" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="hostname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="webAppName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="proxy_hostname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="proxy_port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="non_proxy_hosts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="master" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="sslMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="connection" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="server" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="access" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="database" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="servername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="data_tablespace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="index_tablespace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="attributes" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{}attribute" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="order" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="hop" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="to" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="step" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="distribute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="custom_distribution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="copies" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="hostname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="use_all_replica_members" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="db_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="fields_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="collection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="json_field_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="json_query" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="auth_database" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="auth_user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="auth_password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="auth_mech" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="auth_kerberos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="connect_timeout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="socket_timeout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="use_ssl_socket_factory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="read_preference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="output_json" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="query_is_pipeline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="execute_for_each_row" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="connection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="schema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="table" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="commit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="truncate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ignore_errors" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="use_batch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="specify_fields" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="partitioning_enabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="partitioning_field" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="partitioning_daily" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="partitioning_monthly" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="tablename_in_field" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="tablename_field" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="tablename_in_table" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="return_keys" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="return_field" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sql" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="lookup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="execute_each_row" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="variables_active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="lazy_conversion_active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="separator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="enclosure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="enclosure_forced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="enclosure_fix_disabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="header" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="footer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="compression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="endedLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="fileNameInField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="fileNameField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="create_parent_folder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="attributes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cluster_schema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="partitioning" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="schema_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="mongo_fields" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="mongo_field" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="field_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="field_path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="field_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="file" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="servlet_output" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="do_not_open_new_file_init" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="extention" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="append" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="split" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="haspartno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="add_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="add_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SpecifyFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="date_time_format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="add_to_result_filenames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="pad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="fast_dump" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="splitevery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="fields" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{}field" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="remotesteps" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="input" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="output" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="GUI" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="xloc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="yloc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="draw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "notepads",
    "stepErrorHandling",
    "slaveStepCopyPartitionDistribution",
    "slaveTransformation",
    "attributes",
    "info",
    "connection",
    "order",
    "step"
})
@XmlRootElement(name = "transformation")
public class Transformation {

    protected String notepads;
    @XmlElement(name = "step_error_handling")
    protected String stepErrorHandling;
    @XmlElement(name = "slave-step-copy-partition-distribution")
    protected String slaveStepCopyPartitionDistribution;
    @XmlElement(name = "slave_transformation")
    protected String slaveTransformation;
    protected String attributes;
    protected List<Transformation.Info> info;
    protected List<Transformation.Connection> connection;
    protected List<Transformation.Order> order;
    protected List<Transformation.Step> step;

    /**
     * 获取notepads属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotepads() {
        return notepads;
    }

    /**
     * 设置notepads属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotepads(String value) {
        this.notepads = value;
    }

    /**
     * 获取stepErrorHandling属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStepErrorHandling() {
        return stepErrorHandling;
    }

    /**
     * 设置stepErrorHandling属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStepErrorHandling(String value) {
        this.stepErrorHandling = value;
    }

    /**
     * 获取slaveStepCopyPartitionDistribution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlaveStepCopyPartitionDistribution() {
        return slaveStepCopyPartitionDistribution;
    }

    /**
     * 设置slaveStepCopyPartitionDistribution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlaveStepCopyPartitionDistribution(String value) {
        this.slaveStepCopyPartitionDistribution = value;
    }

    /**
     * 获取slaveTransformation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlaveTransformation() {
        return slaveTransformation;
    }

    /**
     * 设置slaveTransformation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlaveTransformation(String value) {
        this.slaveTransformation = value;
    }

    /**
     * 获取attributes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributes() {
        return attributes;
    }

    /**
     * 设置attributes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributes(String value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the info property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Transformation.Info }
     * 
     * 
     */
    public List<Transformation.Info> getInfo() {
        if (info == null) {
            info = new ArrayList<Transformation.Info>();
        }
        return this.info;
    }

    /**
     * Gets the value of the connection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Transformation.Connection }
     * 
     * 
     */
    public List<Transformation.Connection> getConnection() {
        if (connection == null) {
            connection = new ArrayList<Transformation.Connection>();
        }
        return this.connection;
    }

    /**
     * Gets the value of the order property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the order property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Transformation.Order }
     * 
     * 
     */
    public List<Transformation.Order> getOrder() {
        if (order == null) {
            order = new ArrayList<Transformation.Order>();
        }
        return this.order;
    }

    /**
     * Gets the value of the step property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the step property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Transformation.Step }
     * 
     * 
     */
    public List<Transformation.Step> getStep() {
        if (step == null) {
            step = new ArrayList<Transformation.Step>();
        }
        return this.step;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="server" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="access" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="database" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="servername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="data_tablespace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="index_tablespace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="attributes" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{}attribute" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "server",
        "type",
        "access",
        "database",
        "port",
        "username",
        "password",
        "servername",
        "dataTablespace",
        "indexTablespace",
        "attributes"
    })
    public static class Connection {

        protected String name;
        protected String server;
        protected String type;
        protected String access;
        protected String database;
        protected String port;
        protected String username;
        protected String password;
        protected String servername;
        @XmlElement(name = "data_tablespace")
        protected String dataTablespace;
        @XmlElement(name = "index_tablespace")
        protected String indexTablespace;
        protected List<Transformation.Connection.Attributes> attributes;

        /**
         * 获取name属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * 设置name属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * 获取server属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServer() {
            return server;
        }

        /**
         * 设置server属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServer(String value) {
            this.server = value;
        }

        /**
         * 获取type属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * 设置type属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * 获取access属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccess() {
            return access;
        }

        /**
         * 设置access属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccess(String value) {
            this.access = value;
        }

        /**
         * 获取database属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDatabase() {
            return database;
        }

        /**
         * 设置database属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDatabase(String value) {
            this.database = value;
        }

        /**
         * 获取port属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPort() {
            return port;
        }

        /**
         * 设置port属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPort(String value) {
            this.port = value;
        }

        /**
         * 获取username属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsername() {
            return username;
        }

        /**
         * 设置username属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsername(String value) {
            this.username = value;
        }

        /**
         * 获取password属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassword() {
            return password;
        }

        /**
         * 设置password属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassword(String value) {
            this.password = value;
        }

        /**
         * 获取servername属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServername() {
            return servername;
        }

        /**
         * 设置servername属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServername(String value) {
            this.servername = value;
        }

        /**
         * 获取dataTablespace属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDataTablespace() {
            return dataTablespace;
        }

        /**
         * 设置dataTablespace属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDataTablespace(String value) {
            this.dataTablespace = value;
        }

        /**
         * 获取indexTablespace属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIndexTablespace() {
            return indexTablespace;
        }

        /**
         * 设置indexTablespace属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIndexTablespace(String value) {
            this.indexTablespace = value;
        }

        /**
         * Gets the value of the attributes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attributes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttributes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Transformation.Connection.Attributes }
         * 
         * 
         */
        public List<Transformation.Connection.Attributes> getAttributes() {
            if (attributes == null) {
                attributes = new ArrayList<Transformation.Connection.Attributes>();
            }
            return this.attributes;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element ref="{}attribute" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "attribute"
        })
        public static class Attributes {

            protected List<Attribute> attribute;

            /**
             * Gets the value of the attribute property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the attribute property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAttribute().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Attribute }
             * 
             * 
             */
            public List<Attribute> getAttribute() {
                if (attribute == null) {
                    attribute = new ArrayList<Attribute>();
                }
                return this.attribute;
            }

        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="extended_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="trans_version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="trans_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="directory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="parameters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="size_rowset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sleep_time_empty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sleep_time_full" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="unique_connections" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="feedback_shown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="feedback_size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="using_thread_priorities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="shared_objects_file" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="capture_step_performance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="step_performance_capturing_delay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="step_performance_capturing_size_limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="dependencies" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="partitionschemas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="clusterschemas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="created_user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="created_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="modified_user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="modified_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="key_for_session_key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="is_key_private" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="log" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="trans-log-table" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="connection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="schema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="table" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="size_limit_lines" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="interval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="timeout_days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element ref="{}field" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="perf-log-table" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="connection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="schema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="table" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="interval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="timeout_days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element ref="{}field" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="channel-log-table" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="connection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="schema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="table" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="timeout_days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element ref="{}field" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="step-log-table" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="connection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="schema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="table" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="timeout_days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element ref="{}field" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="metrics-log-table" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="connection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="schema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="table" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="timeout_days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element ref="{}field" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="maxdate" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="connection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="table" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="field" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="maxdiff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="slaveservers" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="slaveserver" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="hostname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="webAppName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="proxy_hostname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="proxy_port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="non_proxy_hosts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="master" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="sslMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "description",
        "extendedDescription",
        "transVersion",
        "transType",
        "directory",
        "parameters",
        "sizeRowset",
        "sleepTimeEmpty",
        "sleepTimeFull",
        "uniqueConnections",
        "feedbackShown",
        "feedbackSize",
        "usingThreadPriorities",
        "sharedObjectsFile",
        "captureStepPerformance",
        "stepPerformanceCapturingDelay",
        "stepPerformanceCapturingSizeLimit",
        "dependencies",
        "partitionschemas",
        "clusterschemas",
        "createdUser",
        "createdDate",
        "modifiedUser",
        "modifiedDate",
        "keyForSessionKey",
        "isKeyPrivate",
        "log",
        "maxdate",
        "slaveservers"
    })
    public static class Info {

        protected String name;
        protected String description;
        @XmlElement(name = "extended_description")
        protected String extendedDescription;
        @XmlElement(name = "trans_version")
        protected String transVersion;
        @XmlElement(name = "trans_type")
        protected String transType;
        protected String directory;
        protected String parameters;
        @XmlElement(name = "size_rowset")
        protected String sizeRowset;
        @XmlElement(name = "sleep_time_empty")
        protected String sleepTimeEmpty;
        @XmlElement(name = "sleep_time_full")
        protected String sleepTimeFull;
        @XmlElement(name = "unique_connections")
        protected String uniqueConnections;
        @XmlElement(name = "feedback_shown")
        protected String feedbackShown;
        @XmlElement(name = "feedback_size")
        protected String feedbackSize;
        @XmlElement(name = "using_thread_priorities")
        protected String usingThreadPriorities;
        @XmlElement(name = "shared_objects_file")
        protected String sharedObjectsFile;
        @XmlElement(name = "capture_step_performance")
        protected String captureStepPerformance;
        @XmlElement(name = "step_performance_capturing_delay")
        protected String stepPerformanceCapturingDelay;
        @XmlElement(name = "step_performance_capturing_size_limit")
        protected String stepPerformanceCapturingSizeLimit;
        protected String dependencies;
        protected String partitionschemas;
        protected String clusterschemas;
        @XmlElement(name = "created_user")
        protected String createdUser;
        @XmlElement(name = "created_date")
        protected String createdDate;
        @XmlElement(name = "modified_user")
        protected String modifiedUser;
        @XmlElement(name = "modified_date")
        protected String modifiedDate;
        @XmlElement(name = "key_for_session_key")
        protected String keyForSessionKey;
        @XmlElement(name = "is_key_private")
        protected String isKeyPrivate;
        protected List<Transformation.Info.Log> log;
        protected List<Transformation.Info.Maxdate> maxdate;
        protected List<Transformation.Info.Slaveservers> slaveservers;

        /**
         * 获取name属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * 设置name属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * 获取description属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * 设置description属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * 获取extendedDescription属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtendedDescription() {
            return extendedDescription;
        }

        /**
         * 设置extendedDescription属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtendedDescription(String value) {
            this.extendedDescription = value;
        }

        /**
         * 获取transVersion属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransVersion() {
            return transVersion;
        }

        /**
         * 设置transVersion属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransVersion(String value) {
            this.transVersion = value;
        }

        /**
         * 获取transType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransType() {
            return transType;
        }

        /**
         * 设置transType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransType(String value) {
            this.transType = value;
        }

        /**
         * 获取directory属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDirectory() {
            return directory;
        }

        /**
         * 设置directory属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDirectory(String value) {
            this.directory = value;
        }

        /**
         * 获取parameters属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParameters() {
            return parameters;
        }

        /**
         * 设置parameters属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParameters(String value) {
            this.parameters = value;
        }

        /**
         * 获取sizeRowset属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSizeRowset() {
            return sizeRowset;
        }

        /**
         * 设置sizeRowset属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSizeRowset(String value) {
            this.sizeRowset = value;
        }

        /**
         * 获取sleepTimeEmpty属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSleepTimeEmpty() {
            return sleepTimeEmpty;
        }

        /**
         * 设置sleepTimeEmpty属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSleepTimeEmpty(String value) {
            this.sleepTimeEmpty = value;
        }

        /**
         * 获取sleepTimeFull属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSleepTimeFull() {
            return sleepTimeFull;
        }

        /**
         * 设置sleepTimeFull属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSleepTimeFull(String value) {
            this.sleepTimeFull = value;
        }

        /**
         * 获取uniqueConnections属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUniqueConnections() {
            return uniqueConnections;
        }

        /**
         * 设置uniqueConnections属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUniqueConnections(String value) {
            this.uniqueConnections = value;
        }

        /**
         * 获取feedbackShown属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFeedbackShown() {
            return feedbackShown;
        }

        /**
         * 设置feedbackShown属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFeedbackShown(String value) {
            this.feedbackShown = value;
        }

        /**
         * 获取feedbackSize属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFeedbackSize() {
            return feedbackSize;
        }

        /**
         * 设置feedbackSize属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFeedbackSize(String value) {
            this.feedbackSize = value;
        }

        /**
         * 获取usingThreadPriorities属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsingThreadPriorities() {
            return usingThreadPriorities;
        }

        /**
         * 设置usingThreadPriorities属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsingThreadPriorities(String value) {
            this.usingThreadPriorities = value;
        }

        /**
         * 获取sharedObjectsFile属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSharedObjectsFile() {
            return sharedObjectsFile;
        }

        /**
         * 设置sharedObjectsFile属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSharedObjectsFile(String value) {
            this.sharedObjectsFile = value;
        }

        /**
         * 获取captureStepPerformance属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCaptureStepPerformance() {
            return captureStepPerformance;
        }

        /**
         * 设置captureStepPerformance属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCaptureStepPerformance(String value) {
            this.captureStepPerformance = value;
        }

        /**
         * 获取stepPerformanceCapturingDelay属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStepPerformanceCapturingDelay() {
            return stepPerformanceCapturingDelay;
        }

        /**
         * 设置stepPerformanceCapturingDelay属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStepPerformanceCapturingDelay(String value) {
            this.stepPerformanceCapturingDelay = value;
        }

        /**
         * 获取stepPerformanceCapturingSizeLimit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStepPerformanceCapturingSizeLimit() {
            return stepPerformanceCapturingSizeLimit;
        }

        /**
         * 设置stepPerformanceCapturingSizeLimit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStepPerformanceCapturingSizeLimit(String value) {
            this.stepPerformanceCapturingSizeLimit = value;
        }

        /**
         * 获取dependencies属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDependencies() {
            return dependencies;
        }

        /**
         * 设置dependencies属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDependencies(String value) {
            this.dependencies = value;
        }

        /**
         * 获取partitionschemas属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPartitionschemas() {
            return partitionschemas;
        }

        /**
         * 设置partitionschemas属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPartitionschemas(String value) {
            this.partitionschemas = value;
        }

        /**
         * 获取clusterschemas属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClusterschemas() {
            return clusterschemas;
        }

        /**
         * 设置clusterschemas属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClusterschemas(String value) {
            this.clusterschemas = value;
        }

        /**
         * 获取createdUser属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreatedUser() {
            return createdUser;
        }

        /**
         * 设置createdUser属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreatedUser(String value) {
            this.createdUser = value;
        }

        /**
         * 获取createdDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreatedDate() {
            return createdDate;
        }

        /**
         * 设置createdDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreatedDate(String value) {
            this.createdDate = value;
        }

        /**
         * 获取modifiedUser属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModifiedUser() {
            return modifiedUser;
        }

        /**
         * 设置modifiedUser属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModifiedUser(String value) {
            this.modifiedUser = value;
        }

        /**
         * 获取modifiedDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModifiedDate() {
            return modifiedDate;
        }

        /**
         * 设置modifiedDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModifiedDate(String value) {
            this.modifiedDate = value;
        }

        /**
         * 获取keyForSessionKey属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKeyForSessionKey() {
            return keyForSessionKey;
        }

        /**
         * 设置keyForSessionKey属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKeyForSessionKey(String value) {
            this.keyForSessionKey = value;
        }

        /**
         * 获取isKeyPrivate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsKeyPrivate() {
            return isKeyPrivate;
        }

        /**
         * 设置isKeyPrivate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsKeyPrivate(String value) {
            this.isKeyPrivate = value;
        }

        /**
         * Gets the value of the log property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the log property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLog().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Transformation.Info.Log }
         * 
         * 
         */
        public List<Transformation.Info.Log> getLog() {
            if (log == null) {
                log = new ArrayList<Transformation.Info.Log>();
            }
            return this.log;
        }

        /**
         * Gets the value of the maxdate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the maxdate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMaxdate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Transformation.Info.Maxdate }
         * 
         * 
         */
        public List<Transformation.Info.Maxdate> getMaxdate() {
            if (maxdate == null) {
                maxdate = new ArrayList<Transformation.Info.Maxdate>();
            }
            return this.maxdate;
        }

        /**
         * Gets the value of the slaveservers property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the slaveservers property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSlaveservers().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Transformation.Info.Slaveservers }
         * 
         * 
         */
        public List<Transformation.Info.Slaveservers> getSlaveservers() {
            if (slaveservers == null) {
                slaveservers = new ArrayList<Transformation.Info.Slaveservers>();
            }
            return this.slaveservers;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="trans-log-table" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="connection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="schema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="table" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="size_limit_lines" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="interval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="timeout_days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element ref="{}field" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="perf-log-table" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="connection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="schema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="table" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="interval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="timeout_days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element ref="{}field" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="channel-log-table" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="connection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="schema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="table" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="timeout_days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element ref="{}field" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="step-log-table" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="connection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="schema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="table" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="timeout_days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element ref="{}field" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="metrics-log-table" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="connection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="schema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="table" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="timeout_days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element ref="{}field" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "transLogTable",
            "perfLogTable",
            "channelLogTable",
            "stepLogTable",
            "metricsLogTable"
        })
        public static class Log {

            @XmlElement(name = "trans-log-table")
            protected List<Transformation.Info.Log.TransLogTable> transLogTable;
            @XmlElement(name = "perf-log-table")
            protected List<Transformation.Info.Log.PerfLogTable> perfLogTable;
            @XmlElement(name = "channel-log-table")
            protected List<Transformation.Info.Log.ChannelLogTable> channelLogTable;
            @XmlElement(name = "step-log-table")
            protected List<Transformation.Info.Log.StepLogTable> stepLogTable;
            @XmlElement(name = "metrics-log-table")
            protected List<Transformation.Info.Log.MetricsLogTable> metricsLogTable;

            /**
             * Gets the value of the transLogTable property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the transLogTable property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTransLogTable().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Transformation.Info.Log.TransLogTable }
             * 
             * 
             */
            public List<Transformation.Info.Log.TransLogTable> getTransLogTable() {
                if (transLogTable == null) {
                    transLogTable = new ArrayList<Transformation.Info.Log.TransLogTable>();
                }
                return this.transLogTable;
            }

            /**
             * Gets the value of the perfLogTable property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the perfLogTable property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPerfLogTable().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Transformation.Info.Log.PerfLogTable }
             * 
             * 
             */
            public List<Transformation.Info.Log.PerfLogTable> getPerfLogTable() {
                if (perfLogTable == null) {
                    perfLogTable = new ArrayList<Transformation.Info.Log.PerfLogTable>();
                }
                return this.perfLogTable;
            }

            /**
             * Gets the value of the channelLogTable property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the channelLogTable property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getChannelLogTable().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Transformation.Info.Log.ChannelLogTable }
             * 
             * 
             */
            public List<Transformation.Info.Log.ChannelLogTable> getChannelLogTable() {
                if (channelLogTable == null) {
                    channelLogTable = new ArrayList<Transformation.Info.Log.ChannelLogTable>();
                }
                return this.channelLogTable;
            }

            /**
             * Gets the value of the stepLogTable property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the stepLogTable property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStepLogTable().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Transformation.Info.Log.StepLogTable }
             * 
             * 
             */
            public List<Transformation.Info.Log.StepLogTable> getStepLogTable() {
                if (stepLogTable == null) {
                    stepLogTable = new ArrayList<Transformation.Info.Log.StepLogTable>();
                }
                return this.stepLogTable;
            }

            /**
             * Gets the value of the metricsLogTable property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the metricsLogTable property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMetricsLogTable().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Transformation.Info.Log.MetricsLogTable }
             * 
             * 
             */
            public List<Transformation.Info.Log.MetricsLogTable> getMetricsLogTable() {
                if (metricsLogTable == null) {
                    metricsLogTable = new ArrayList<Transformation.Info.Log.MetricsLogTable>();
                }
                return this.metricsLogTable;
            }


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="connection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="schema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="table" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="timeout_days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element ref="{}field" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "connection",
                "schema",
                "table",
                "timeoutDays",
                "field"
            })
            public static class ChannelLogTable {

                protected String connection;
                protected String schema;
                protected String table;
                @XmlElement(name = "timeout_days")
                protected String timeoutDays;
                protected List<Field> field;

                /**
                 * 获取connection属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getConnection() {
                    return connection;
                }

                /**
                 * 设置connection属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setConnection(String value) {
                    this.connection = value;
                }

                /**
                 * 获取schema属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSchema() {
                    return schema;
                }

                /**
                 * 设置schema属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSchema(String value) {
                    this.schema = value;
                }

                /**
                 * 获取table属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTable() {
                    return table;
                }

                /**
                 * 设置table属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTable(String value) {
                    this.table = value;
                }

                /**
                 * 获取timeoutDays属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTimeoutDays() {
                    return timeoutDays;
                }

                /**
                 * 设置timeoutDays属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTimeoutDays(String value) {
                    this.timeoutDays = value;
                }

                /**
                 * Gets the value of the field property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the field property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getField().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Field }
                 * 
                 * 
                 */
                public List<Field> getField() {
                    if (field == null) {
                        field = new ArrayList<Field>();
                    }
                    return this.field;
                }

            }


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="connection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="schema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="table" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="timeout_days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element ref="{}field" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "connection",
                "schema",
                "table",
                "timeoutDays",
                "field"
            })
            public static class MetricsLogTable {

                protected String connection;
                protected String schema;
                protected String table;
                @XmlElement(name = "timeout_days")
                protected String timeoutDays;
                protected List<Field> field;

                /**
                 * 获取connection属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getConnection() {
                    return connection;
                }

                /**
                 * 设置connection属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setConnection(String value) {
                    this.connection = value;
                }

                /**
                 * 获取schema属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSchema() {
                    return schema;
                }

                /**
                 * 设置schema属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSchema(String value) {
                    this.schema = value;
                }

                /**
                 * 获取table属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTable() {
                    return table;
                }

                /**
                 * 设置table属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTable(String value) {
                    this.table = value;
                }

                /**
                 * 获取timeoutDays属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTimeoutDays() {
                    return timeoutDays;
                }

                /**
                 * 设置timeoutDays属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTimeoutDays(String value) {
                    this.timeoutDays = value;
                }

                /**
                 * Gets the value of the field property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the field property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getField().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Field }
                 * 
                 * 
                 */
                public List<Field> getField() {
                    if (field == null) {
                        field = new ArrayList<Field>();
                    }
                    return this.field;
                }

            }


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="connection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="schema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="table" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="interval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="timeout_days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element ref="{}field" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "connection",
                "schema",
                "table",
                "interval",
                "timeoutDays",
                "field"
            })
            public static class PerfLogTable {

                protected String connection;
                protected String schema;
                protected String table;
                protected String interval;
                @XmlElement(name = "timeout_days")
                protected String timeoutDays;
                protected List<Field> field;

                /**
                 * 获取connection属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getConnection() {
                    return connection;
                }

                /**
                 * 设置connection属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setConnection(String value) {
                    this.connection = value;
                }

                /**
                 * 获取schema属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSchema() {
                    return schema;
                }

                /**
                 * 设置schema属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSchema(String value) {
                    this.schema = value;
                }

                /**
                 * 获取table属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTable() {
                    return table;
                }

                /**
                 * 设置table属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTable(String value) {
                    this.table = value;
                }

                /**
                 * 获取interval属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getInterval() {
                    return interval;
                }

                /**
                 * 设置interval属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setInterval(String value) {
                    this.interval = value;
                }

                /**
                 * 获取timeoutDays属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTimeoutDays() {
                    return timeoutDays;
                }

                /**
                 * 设置timeoutDays属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTimeoutDays(String value) {
                    this.timeoutDays = value;
                }

                /**
                 * Gets the value of the field property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the field property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getField().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Field }
                 * 
                 * 
                 */
                public List<Field> getField() {
                    if (field == null) {
                        field = new ArrayList<Field>();
                    }
                    return this.field;
                }

            }


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="connection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="schema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="table" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="timeout_days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element ref="{}field" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "connection",
                "schema",
                "table",
                "timeoutDays",
                "field"
            })
            public static class StepLogTable {

                protected String connection;
                protected String schema;
                protected String table;
                @XmlElement(name = "timeout_days")
                protected String timeoutDays;
                protected List<Field> field;

                /**
                 * 获取connection属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getConnection() {
                    return connection;
                }

                /**
                 * 设置connection属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setConnection(String value) {
                    this.connection = value;
                }

                /**
                 * 获取schema属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSchema() {
                    return schema;
                }

                /**
                 * 设置schema属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSchema(String value) {
                    this.schema = value;
                }

                /**
                 * 获取table属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTable() {
                    return table;
                }

                /**
                 * 设置table属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTable(String value) {
                    this.table = value;
                }

                /**
                 * 获取timeoutDays属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTimeoutDays() {
                    return timeoutDays;
                }

                /**
                 * 设置timeoutDays属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTimeoutDays(String value) {
                    this.timeoutDays = value;
                }

                /**
                 * Gets the value of the field property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the field property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getField().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Field }
                 * 
                 * 
                 */
                public List<Field> getField() {
                    if (field == null) {
                        field = new ArrayList<Field>();
                    }
                    return this.field;
                }

            }


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="connection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="schema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="table" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="size_limit_lines" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="interval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="timeout_days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element ref="{}field" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "connection",
                "schema",
                "table",
                "sizeLimitLines",
                "interval",
                "timeoutDays",
                "field"
            })
            public static class TransLogTable {

                protected String connection;
                protected String schema;
                protected String table;
                @XmlElement(name = "size_limit_lines")
                protected String sizeLimitLines;
                protected String interval;
                @XmlElement(name = "timeout_days")
                protected String timeoutDays;
                protected List<Field> field;

                /**
                 * 获取connection属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getConnection() {
                    return connection;
                }

                /**
                 * 设置connection属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setConnection(String value) {
                    this.connection = value;
                }

                /**
                 * 获取schema属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSchema() {
                    return schema;
                }

                /**
                 * 设置schema属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSchema(String value) {
                    this.schema = value;
                }

                /**
                 * 获取table属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTable() {
                    return table;
                }

                /**
                 * 设置table属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTable(String value) {
                    this.table = value;
                }

                /**
                 * 获取sizeLimitLines属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSizeLimitLines() {
                    return sizeLimitLines;
                }

                /**
                 * 设置sizeLimitLines属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSizeLimitLines(String value) {
                    this.sizeLimitLines = value;
                }

                /**
                 * 获取interval属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getInterval() {
                    return interval;
                }

                /**
                 * 设置interval属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setInterval(String value) {
                    this.interval = value;
                }

                /**
                 * 获取timeoutDays属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTimeoutDays() {
                    return timeoutDays;
                }

                /**
                 * 设置timeoutDays属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTimeoutDays(String value) {
                    this.timeoutDays = value;
                }

                /**
                 * Gets the value of the field property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the field property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getField().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Field }
                 * 
                 * 
                 */
                public List<Field> getField() {
                    if (field == null) {
                        field = new ArrayList<Field>();
                    }
                    return this.field;
                }

            }

        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="connection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="table" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="field" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="maxdiff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "connection",
            "table",
            "field",
            "offset",
            "maxdiff"
        })
        public static class Maxdate {

            protected String connection;
            protected String table;
            protected String field;
            protected String offset;
            protected String maxdiff;

            /**
             * 获取connection属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getConnection() {
                return connection;
            }

            /**
             * 设置connection属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setConnection(String value) {
                this.connection = value;
            }

            /**
             * 获取table属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTable() {
                return table;
            }

            /**
             * 设置table属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTable(String value) {
                this.table = value;
            }

            /**
             * 获取field属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getField() {
                return field;
            }

            /**
             * 设置field属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setField(String value) {
                this.field = value;
            }

            /**
             * 获取offset属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOffset() {
                return offset;
            }

            /**
             * 设置offset属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOffset(String value) {
                this.offset = value;
            }

            /**
             * 获取maxdiff属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMaxdiff() {
                return maxdiff;
            }

            /**
             * 设置maxdiff属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMaxdiff(String value) {
                this.maxdiff = value;
            }

        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="slaveserver" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="hostname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="webAppName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="proxy_hostname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="proxy_port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="non_proxy_hosts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="master" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="sslMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "slaveserver"
        })
        public static class Slaveservers {

            protected List<Transformation.Info.Slaveservers.Slaveserver> slaveserver;

            /**
             * Gets the value of the slaveserver property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the slaveserver property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSlaveserver().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Transformation.Info.Slaveservers.Slaveserver }
             * 
             * 
             */
            public List<Transformation.Info.Slaveservers.Slaveserver> getSlaveserver() {
                if (slaveserver == null) {
                    slaveserver = new ArrayList<Transformation.Info.Slaveservers.Slaveserver>();
                }
                return this.slaveserver;
            }


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="hostname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="webAppName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="proxy_hostname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="proxy_port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="non_proxy_hosts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="master" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="sslMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "name",
                "hostname",
                "port",
                "webAppName",
                "username",
                "password",
                "proxyHostname",
                "proxyPort",
                "nonProxyHosts",
                "master",
                "sslMode"
            })
            public static class Slaveserver {

                protected String name;
                protected String hostname;
                protected String port;
                protected String webAppName;
                protected String username;
                protected String password;
                @XmlElement(name = "proxy_hostname")
                protected String proxyHostname;
                @XmlElement(name = "proxy_port")
                protected String proxyPort;
                @XmlElement(name = "non_proxy_hosts")
                protected String nonProxyHosts;
                protected String master;
                protected String sslMode;

                /**
                 * 获取name属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * 设置name属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * 获取hostname属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHostname() {
                    return hostname;
                }

                /**
                 * 设置hostname属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHostname(String value) {
                    this.hostname = value;
                }

                /**
                 * 获取port属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPort() {
                    return port;
                }

                /**
                 * 设置port属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPort(String value) {
                    this.port = value;
                }

                /**
                 * 获取webAppName属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getWebAppName() {
                    return webAppName;
                }

                /**
                 * 设置webAppName属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setWebAppName(String value) {
                    this.webAppName = value;
                }

                /**
                 * 获取username属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUsername() {
                    return username;
                }

                /**
                 * 设置username属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUsername(String value) {
                    this.username = value;
                }

                /**
                 * 获取password属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPassword() {
                    return password;
                }

                /**
                 * 设置password属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPassword(String value) {
                    this.password = value;
                }

                /**
                 * 获取proxyHostname属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProxyHostname() {
                    return proxyHostname;
                }

                /**
                 * 设置proxyHostname属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProxyHostname(String value) {
                    this.proxyHostname = value;
                }

                /**
                 * 获取proxyPort属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProxyPort() {
                    return proxyPort;
                }

                /**
                 * 设置proxyPort属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProxyPort(String value) {
                    this.proxyPort = value;
                }

                /**
                 * 获取nonProxyHosts属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNonProxyHosts() {
                    return nonProxyHosts;
                }

                /**
                 * 设置nonProxyHosts属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNonProxyHosts(String value) {
                    this.nonProxyHosts = value;
                }

                /**
                 * 获取master属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMaster() {
                    return master;
                }

                /**
                 * 设置master属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMaster(String value) {
                    this.master = value;
                }

                /**
                 * 获取sslMode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSslMode() {
                    return sslMode;
                }

                /**
                 * 设置sslMode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSslMode(String value) {
                    this.sslMode = value;
                }

            }

        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="hop" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="to" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "hop"
    })
    public static class Order {

        protected List<Transformation.Order.Hop> hop;

        /**
         * Gets the value of the hop property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hop property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHop().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Transformation.Order.Hop }
         * 
         * 
         */
        public List<Transformation.Order.Hop> getHop() {
            if (hop == null) {
                hop = new ArrayList<Transformation.Order.Hop>();
            }
            return this.hop;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="to" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "from",
            "to",
            "enabled"
        })
        public static class Hop {

            protected String from;
            protected String to;
            protected String enabled;

            /**
             * 获取from属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFrom() {
                return from;
            }

            /**
             * 设置from属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFrom(String value) {
                this.from = value;
            }

            /**
             * 获取to属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTo() {
                return to;
            }

            /**
             * 设置to属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTo(String value) {
                this.to = value;
            }

            /**
             * 获取enabled属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEnabled() {
                return enabled;
            }

            /**
             * 设置enabled属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEnabled(String value) {
                this.enabled = value;
            }

        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="distribute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="custom_distribution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="copies" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="hostname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="use_all_replica_members" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="db_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="fields_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="collection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="json_field_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="json_query" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="auth_database" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="auth_user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="auth_password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="auth_mech" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="auth_kerberos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="connect_timeout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="socket_timeout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="use_ssl_socket_factory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="read_preference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="output_json" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="query_is_pipeline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="execute_for_each_row" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="connection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="schema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="table" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="commit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="truncate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ignore_errors" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="use_batch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="specify_fields" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="partitioning_enabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="partitioning_field" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="partitioning_daily" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="partitioning_monthly" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="tablename_in_field" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="tablename_field" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="tablename_in_table" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="return_keys" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="return_field" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sql" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="lookup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="execute_each_row" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="variables_active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="lazy_conversion_active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="separator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="enclosure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="enclosure_forced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="enclosure_fix_disabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="header" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="footer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="compression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="endedLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="fileNameInField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="fileNameField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="create_parent_folder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="attributes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cluster_schema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="partitioning" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="schema_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="mongo_fields" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="mongo_field" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="field_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="field_path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="field_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="file" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="servlet_output" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="do_not_open_new_file_init" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="extention" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="append" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="split" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="haspartno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="add_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="add_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SpecifyFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="date_time_format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="add_to_result_filenames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="pad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="fast_dump" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="splitevery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="fields" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{}field" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="remotesteps" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="input" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="output" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="GUI" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="xloc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="yloc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="draw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "type",
        "description",
        "distribute",
        "customDistribution",
        "copies",
        "hostname",
        "port",
        "useAllReplicaMembers",
        "dbName",
        "fieldsName",
        "collection",
        "jsonFieldName",
        "jsonQuery",
        "authDatabase",
        "authUser",
        "authPassword",
        "authMech",
        "authKerberos",
        "connectTimeout",
        "socketTimeout",
        "useSslSocketFactory",
        "readPreference",
        "outputJson",
        "queryIsPipeline",
        "executeForEachRow",
        "connection",
        "schema",
        "table",
        "commit",
        "truncate",
        "ignoreErrors",
        "useBatch",
        "specifyFields",
        "partitioningEnabled",
        "partitioningField",
        "partitioningDaily",
        "partitioningMonthly",
        "tablenameInField",
        "tablenameField",
        "tablenameInTable",
        "returnKeys",
        "returnField",
        "sql",
        "limit",
        "lookup",
        "executeEachRow",
        "variablesActive",
        "lazyConversionActive",
        "separator",
        "enclosure",
        "enclosureForced",
        "enclosureFixDisabled",
        "header",
        "footer",
        "format",
        "compression",
        "encoding",
        "endedLine",
        "fileNameInField",
        "fileNameField",
        "createParentFolder",
        "attributes",
        "clusterSchema",
        "partitioning",
        "mongoFields",
        "file",
        "fields",
        "remotesteps",
        "gui"
    })
    public static class Step {

        protected String name;
        protected String type;
        protected String description;
        protected String distribute;
        @XmlElement(name = "custom_distribution")
        protected String customDistribution;
        protected String copies;
        protected String hostname;
        protected String port;
        @XmlElement(name = "use_all_replica_members")
        protected String useAllReplicaMembers;
        @XmlElement(name = "db_name")
        protected String dbName;
        @XmlElement(name = "fields_name")
        protected String fieldsName;
        protected String collection;
        @XmlElement(name = "json_field_name")
        protected String jsonFieldName;
        @XmlElement(name = "json_query")
        protected String jsonQuery;
        @XmlElement(name = "auth_database")
        protected String authDatabase;
        @XmlElement(name = "auth_user")
        protected String authUser;
        @XmlElement(name = "auth_password")
        protected String authPassword;
        @XmlElement(name = "auth_mech")
        protected String authMech;
        @XmlElement(name = "auth_kerberos")
        protected String authKerberos;
        @XmlElement(name = "connect_timeout")
        protected String connectTimeout;
        @XmlElement(name = "socket_timeout")
        protected String socketTimeout;
        @XmlElement(name = "use_ssl_socket_factory")
        protected String useSslSocketFactory;
        @XmlElement(name = "read_preference")
        protected String readPreference;
        @XmlElement(name = "output_json")
        protected String outputJson;
        @XmlElement(name = "query_is_pipeline")
        protected String queryIsPipeline;
        @XmlElement(name = "execute_for_each_row")
        protected String executeForEachRow;
        protected String connection;
        protected String schema;
        protected String table;
        protected String commit;
        protected String truncate;
        @XmlElement(name = "ignore_errors")
        protected String ignoreErrors;
        @XmlElement(name = "use_batch")
        protected String useBatch;
        @XmlElement(name = "specify_fields")
        protected String specifyFields;
        @XmlElement(name = "partitioning_enabled")
        protected String partitioningEnabled;
        @XmlElement(name = "partitioning_field")
        protected String partitioningField;
        @XmlElement(name = "partitioning_daily")
        protected String partitioningDaily;
        @XmlElement(name = "partitioning_monthly")
        protected String partitioningMonthly;
        @XmlElement(name = "tablename_in_field")
        protected String tablenameInField;
        @XmlElement(name = "tablename_field")
        protected String tablenameField;
        @XmlElement(name = "tablename_in_table")
        protected String tablenameInTable;
        @XmlElement(name = "return_keys")
        protected String returnKeys;
        @XmlElement(name = "return_field")
        protected String returnField;
        protected String sql;
        protected String limit;
        protected String lookup;
        @XmlElement(name = "execute_each_row")
        protected String executeEachRow;
        @XmlElement(name = "variables_active")
        protected String variablesActive;
        @XmlElement(name = "lazy_conversion_active")
        protected String lazyConversionActive;
        protected String separator;
        protected String enclosure;
        @XmlElement(name = "enclosure_forced")
        protected String enclosureForced;
        @XmlElement(name = "enclosure_fix_disabled")
        protected String enclosureFixDisabled;
        protected String header;
        protected String footer;
        protected String format;
        protected String compression;
        protected String encoding;
        protected String endedLine;
        protected String fileNameInField;
        protected String fileNameField;
        @XmlElement(name = "create_parent_folder")
        protected String createParentFolder;
        protected String attributes;
        @XmlElement(name = "cluster_schema")
        protected String clusterSchema;
        protected List<Transformation.Step.Partitioning> partitioning;
        @XmlElement(name = "mongo_fields")
        protected List<Transformation.Step.MongoFields> mongoFields;
        protected List<Transformation.Step.File> file;
        protected List<Transformation.Step.Fields> fields;
        protected List<Transformation.Step.Remotesteps> remotesteps;
        @XmlElement(name = "GUI")
        protected List<Transformation.Step.GUI> gui;

        /**
         * 获取name属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * 设置name属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * 获取type属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * 设置type属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * 获取description属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * 设置description属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * 获取distribute属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDistribute() {
            return distribute;
        }

        /**
         * 设置distribute属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDistribute(String value) {
            this.distribute = value;
        }

        /**
         * 获取customDistribution属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomDistribution() {
            return customDistribution;
        }

        /**
         * 设置customDistribution属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomDistribution(String value) {
            this.customDistribution = value;
        }

        /**
         * 获取copies属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCopies() {
            return copies;
        }

        /**
         * 设置copies属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCopies(String value) {
            this.copies = value;
        }

        /**
         * 获取hostname属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHostname() {
            return hostname;
        }

        /**
         * 设置hostname属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHostname(String value) {
            this.hostname = value;
        }

        /**
         * 获取port属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPort() {
            return port;
        }

        /**
         * 设置port属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPort(String value) {
            this.port = value;
        }

        /**
         * 获取useAllReplicaMembers属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUseAllReplicaMembers() {
            return useAllReplicaMembers;
        }

        /**
         * 设置useAllReplicaMembers属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUseAllReplicaMembers(String value) {
            this.useAllReplicaMembers = value;
        }

        /**
         * 获取dbName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDbName() {
            return dbName;
        }

        /**
         * 设置dbName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDbName(String value) {
            this.dbName = value;
        }

        /**
         * 获取fieldsName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFieldsName() {
            return fieldsName;
        }

        /**
         * 设置fieldsName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFieldsName(String value) {
            this.fieldsName = value;
        }

        /**
         * 获取collection属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCollection() {
            return collection;
        }

        /**
         * 设置collection属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCollection(String value) {
            this.collection = value;
        }

        /**
         * 获取jsonFieldName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJsonFieldName() {
            return jsonFieldName;
        }

        /**
         * 设置jsonFieldName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJsonFieldName(String value) {
            this.jsonFieldName = value;
        }

        /**
         * 获取jsonQuery属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJsonQuery() {
            return jsonQuery;
        }

        /**
         * 设置jsonQuery属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJsonQuery(String value) {
            this.jsonQuery = value;
        }

        /**
         * 获取authDatabase属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthDatabase() {
            return authDatabase;
        }

        /**
         * 设置authDatabase属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthDatabase(String value) {
            this.authDatabase = value;
        }

        /**
         * 获取authUser属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthUser() {
            return authUser;
        }

        /**
         * 设置authUser属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthUser(String value) {
            this.authUser = value;
        }

        /**
         * 获取authPassword属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthPassword() {
            return authPassword;
        }

        /**
         * 设置authPassword属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthPassword(String value) {
            this.authPassword = value;
        }

        /**
         * 获取authMech属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthMech() {
            return authMech;
        }

        /**
         * 设置authMech属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthMech(String value) {
            this.authMech = value;
        }

        /**
         * 获取authKerberos属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthKerberos() {
            return authKerberos;
        }

        /**
         * 设置authKerberos属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthKerberos(String value) {
            this.authKerberos = value;
        }

        /**
         * 获取connectTimeout属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConnectTimeout() {
            return connectTimeout;
        }

        /**
         * 设置connectTimeout属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConnectTimeout(String value) {
            this.connectTimeout = value;
        }

        /**
         * 获取socketTimeout属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSocketTimeout() {
            return socketTimeout;
        }

        /**
         * 设置socketTimeout属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSocketTimeout(String value) {
            this.socketTimeout = value;
        }

        /**
         * 获取useSslSocketFactory属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUseSslSocketFactory() {
            return useSslSocketFactory;
        }

        /**
         * 设置useSslSocketFactory属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUseSslSocketFactory(String value) {
            this.useSslSocketFactory = value;
        }

        /**
         * 获取readPreference属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReadPreference() {
            return readPreference;
        }

        /**
         * 设置readPreference属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReadPreference(String value) {
            this.readPreference = value;
        }

        /**
         * 获取outputJson属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOutputJson() {
            return outputJson;
        }

        /**
         * 设置outputJson属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOutputJson(String value) {
            this.outputJson = value;
        }

        /**
         * 获取queryIsPipeline属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQueryIsPipeline() {
            return queryIsPipeline;
        }

        /**
         * 设置queryIsPipeline属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQueryIsPipeline(String value) {
            this.queryIsPipeline = value;
        }

        /**
         * 获取executeForEachRow属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExecuteForEachRow() {
            return executeForEachRow;
        }

        /**
         * 设置executeForEachRow属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExecuteForEachRow(String value) {
            this.executeForEachRow = value;
        }

        /**
         * 获取connection属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConnection() {
            return connection;
        }

        /**
         * 设置connection属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConnection(String value) {
            this.connection = value;
        }

        /**
         * 获取schema属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSchema() {
            return schema;
        }

        /**
         * 设置schema属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSchema(String value) {
            this.schema = value;
        }

        /**
         * 获取table属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTable() {
            return table;
        }

        /**
         * 设置table属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTable(String value) {
            this.table = value;
        }

        /**
         * 获取commit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCommit() {
            return commit;
        }

        /**
         * 设置commit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCommit(String value) {
            this.commit = value;
        }

        /**
         * 获取truncate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTruncate() {
            return truncate;
        }

        /**
         * 设置truncate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTruncate(String value) {
            this.truncate = value;
        }

        /**
         * 获取ignoreErrors属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIgnoreErrors() {
            return ignoreErrors;
        }

        /**
         * 设置ignoreErrors属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIgnoreErrors(String value) {
            this.ignoreErrors = value;
        }

        /**
         * 获取useBatch属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUseBatch() {
            return useBatch;
        }

        /**
         * 设置useBatch属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUseBatch(String value) {
            this.useBatch = value;
        }

        /**
         * 获取specifyFields属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSpecifyFields() {
            return specifyFields;
        }

        /**
         * 设置specifyFields属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSpecifyFields(String value) {
            this.specifyFields = value;
        }

        /**
         * 获取partitioningEnabled属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPartitioningEnabled() {
            return partitioningEnabled;
        }

        /**
         * 设置partitioningEnabled属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPartitioningEnabled(String value) {
            this.partitioningEnabled = value;
        }

        /**
         * 获取partitioningField属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPartitioningField() {
            return partitioningField;
        }

        /**
         * 设置partitioningField属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPartitioningField(String value) {
            this.partitioningField = value;
        }

        /**
         * 获取partitioningDaily属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPartitioningDaily() {
            return partitioningDaily;
        }

        /**
         * 设置partitioningDaily属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPartitioningDaily(String value) {
            this.partitioningDaily = value;
        }

        /**
         * 获取partitioningMonthly属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPartitioningMonthly() {
            return partitioningMonthly;
        }

        /**
         * 设置partitioningMonthly属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPartitioningMonthly(String value) {
            this.partitioningMonthly = value;
        }

        /**
         * 获取tablenameInField属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTablenameInField() {
            return tablenameInField;
        }

        /**
         * 设置tablenameInField属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTablenameInField(String value) {
            this.tablenameInField = value;
        }

        /**
         * 获取tablenameField属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTablenameField() {
            return tablenameField;
        }

        /**
         * 设置tablenameField属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTablenameField(String value) {
            this.tablenameField = value;
        }

        /**
         * 获取tablenameInTable属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTablenameInTable() {
            return tablenameInTable;
        }

        /**
         * 设置tablenameInTable属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTablenameInTable(String value) {
            this.tablenameInTable = value;
        }

        /**
         * 获取returnKeys属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReturnKeys() {
            return returnKeys;
        }

        /**
         * 设置returnKeys属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReturnKeys(String value) {
            this.returnKeys = value;
        }

        /**
         * 获取returnField属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReturnField() {
            return returnField;
        }

        /**
         * 设置returnField属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReturnField(String value) {
            this.returnField = value;
        }

        /**
         * 获取sql属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSql() {
            return sql;
        }

        /**
         * 设置sql属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSql(String value) {
            this.sql = value;
        }

        /**
         * 获取limit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLimit() {
            return limit;
        }

        /**
         * 设置limit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLimit(String value) {
            this.limit = value;
        }

        /**
         * 获取lookup属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLookup() {
            return lookup;
        }

        /**
         * 设置lookup属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLookup(String value) {
            this.lookup = value;
        }

        /**
         * 获取executeEachRow属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExecuteEachRow() {
            return executeEachRow;
        }

        /**
         * 设置executeEachRow属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExecuteEachRow(String value) {
            this.executeEachRow = value;
        }

        /**
         * 获取variablesActive属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariablesActive() {
            return variablesActive;
        }

        /**
         * 设置variablesActive属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariablesActive(String value) {
            this.variablesActive = value;
        }

        /**
         * 获取lazyConversionActive属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLazyConversionActive() {
            return lazyConversionActive;
        }

        /**
         * 设置lazyConversionActive属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLazyConversionActive(String value) {
            this.lazyConversionActive = value;
        }

        /**
         * 获取separator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSeparator() {
            return separator;
        }

        /**
         * 设置separator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSeparator(String value) {
            this.separator = value;
        }

        /**
         * 获取enclosure属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnclosure() {
            return enclosure;
        }

        /**
         * 设置enclosure属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnclosure(String value) {
            this.enclosure = value;
        }

        /**
         * 获取enclosureForced属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnclosureForced() {
            return enclosureForced;
        }

        /**
         * 设置enclosureForced属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnclosureForced(String value) {
            this.enclosureForced = value;
        }

        /**
         * 获取enclosureFixDisabled属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnclosureFixDisabled() {
            return enclosureFixDisabled;
        }

        /**
         * 设置enclosureFixDisabled属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnclosureFixDisabled(String value) {
            this.enclosureFixDisabled = value;
        }

        /**
         * 获取header属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHeader() {
            return header;
        }

        /**
         * 设置header属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHeader(String value) {
            this.header = value;
        }

        /**
         * 获取footer属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFooter() {
            return footer;
        }

        /**
         * 设置footer属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFooter(String value) {
            this.footer = value;
        }

        /**
         * 获取format属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFormat() {
            return format;
        }

        /**
         * 设置format属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFormat(String value) {
            this.format = value;
        }

        /**
         * 获取compression属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCompression() {
            return compression;
        }

        /**
         * 设置compression属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCompression(String value) {
            this.compression = value;
        }

        /**
         * 获取encoding属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEncoding() {
            return encoding;
        }

        /**
         * 设置encoding属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEncoding(String value) {
            this.encoding = value;
        }

        /**
         * 获取endedLine属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndedLine() {
            return endedLine;
        }

        /**
         * 设置endedLine属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndedLine(String value) {
            this.endedLine = value;
        }

        /**
         * 获取fileNameInField属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFileNameInField() {
            return fileNameInField;
        }

        /**
         * 设置fileNameInField属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFileNameInField(String value) {
            this.fileNameInField = value;
        }

        /**
         * 获取fileNameField属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFileNameField() {
            return fileNameField;
        }

        /**
         * 设置fileNameField属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFileNameField(String value) {
            this.fileNameField = value;
        }

        /**
         * 获取createParentFolder属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreateParentFolder() {
            return createParentFolder;
        }

        /**
         * 设置createParentFolder属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreateParentFolder(String value) {
            this.createParentFolder = value;
        }

        /**
         * 获取attributes属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttributes() {
            return attributes;
        }

        /**
         * 设置attributes属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttributes(String value) {
            this.attributes = value;
        }

        /**
         * 获取clusterSchema属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClusterSchema() {
            return clusterSchema;
        }

        /**
         * 设置clusterSchema属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClusterSchema(String value) {
            this.clusterSchema = value;
        }

        /**
         * Gets the value of the partitioning property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the partitioning property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPartitioning().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Transformation.Step.Partitioning }
         * 
         * 
         */
        public List<Transformation.Step.Partitioning> getPartitioning() {
            if (partitioning == null) {
                partitioning = new ArrayList<Transformation.Step.Partitioning>();
            }
            return this.partitioning;
        }

        /**
         * Gets the value of the mongoFields property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mongoFields property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMongoFields().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Transformation.Step.MongoFields }
         * 
         * 
         */
        public List<Transformation.Step.MongoFields> getMongoFields() {
            if (mongoFields == null) {
                mongoFields = new ArrayList<Transformation.Step.MongoFields>();
            }
            return this.mongoFields;
        }

        /**
         * Gets the value of the file property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the file property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFile().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Transformation.Step.File }
         * 
         * 
         */
        public List<Transformation.Step.File> getFile() {
            if (file == null) {
                file = new ArrayList<Transformation.Step.File>();
            }
            return this.file;
        }

        /**
         * Gets the value of the fields property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fields property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFields().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Transformation.Step.Fields }
         * 
         * 
         */
        public List<Transformation.Step.Fields> getFields() {
            if (fields == null) {
                fields = new ArrayList<Transformation.Step.Fields>();
            }
            return this.fields;
        }

        /**
         * Gets the value of the remotesteps property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the remotesteps property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRemotesteps().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Transformation.Step.Remotesteps }
         * 
         * 
         */
        public List<Transformation.Step.Remotesteps> getRemotesteps() {
            if (remotesteps == null) {
                remotesteps = new ArrayList<Transformation.Step.Remotesteps>();
            }
            return this.remotesteps;
        }

        /**
         * Gets the value of the gui property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the gui property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGUI().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Transformation.Step.GUI }
         * 
         * 
         */
        public List<Transformation.Step.GUI> getGUI() {
            if (gui == null) {
                gui = new ArrayList<Transformation.Step.GUI>();
            }
            return this.gui;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element ref="{}field" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "field"
        })
        public static class Fields {

            protected List<Field> field;

            /**
             * Gets the value of the field property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the field property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getField().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Field }
             * 
             * 
             */
            public List<Field> getField() {
                if (field == null) {
                    field = new ArrayList<Field>();
                }
                return this.field;
            }

        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="servlet_output" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="do_not_open_new_file_init" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="extention" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="append" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="split" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="haspartno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="add_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="add_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SpecifyFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="date_time_format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="add_to_result_filenames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="pad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="fast_dump" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="splitevery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "name",
            "servletOutput",
            "doNotOpenNewFileInit",
            "extention",
            "append",
            "split",
            "haspartno",
            "addDate",
            "addTime",
            "specifyFormat",
            "dateTimeFormat",
            "addToResultFilenames",
            "pad",
            "fastDump",
            "splitevery"
        })
        public static class File {

            protected String name;
            @XmlElement(name = "servlet_output")
            protected String servletOutput;
            @XmlElement(name = "do_not_open_new_file_init")
            protected String doNotOpenNewFileInit;
            protected String extention;
            protected String append;
            protected String split;
            protected String haspartno;
            @XmlElement(name = "add_date")
            protected String addDate;
            @XmlElement(name = "add_time")
            protected String addTime;
            @XmlElement(name = "SpecifyFormat")
            protected String specifyFormat;
            @XmlElement(name = "date_time_format")
            protected String dateTimeFormat;
            @XmlElement(name = "add_to_result_filenames")
            protected String addToResultFilenames;
            protected String pad;
            @XmlElement(name = "fast_dump")
            protected String fastDump;
            protected String splitevery;

            /**
             * 获取name属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * 设置name属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * 获取servletOutput属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServletOutput() {
                return servletOutput;
            }

            /**
             * 设置servletOutput属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServletOutput(String value) {
                this.servletOutput = value;
            }

            /**
             * 获取doNotOpenNewFileInit属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDoNotOpenNewFileInit() {
                return doNotOpenNewFileInit;
            }

            /**
             * 设置doNotOpenNewFileInit属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDoNotOpenNewFileInit(String value) {
                this.doNotOpenNewFileInit = value;
            }

            /**
             * 获取extention属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExtention() {
                return extention;
            }

            /**
             * 设置extention属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExtention(String value) {
                this.extention = value;
            }

            /**
             * 获取append属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAppend() {
                return append;
            }

            /**
             * 设置append属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAppend(String value) {
                this.append = value;
            }

            /**
             * 获取split属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSplit() {
                return split;
            }

            /**
             * 设置split属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSplit(String value) {
                this.split = value;
            }

            /**
             * 获取haspartno属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHaspartno() {
                return haspartno;
            }

            /**
             * 设置haspartno属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHaspartno(String value) {
                this.haspartno = value;
            }

            /**
             * 获取addDate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddDate() {
                return addDate;
            }

            /**
             * 设置addDate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddDate(String value) {
                this.addDate = value;
            }

            /**
             * 获取addTime属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddTime() {
                return addTime;
            }

            /**
             * 设置addTime属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddTime(String value) {
                this.addTime = value;
            }

            /**
             * 获取specifyFormat属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSpecifyFormat() {
                return specifyFormat;
            }

            /**
             * 设置specifyFormat属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSpecifyFormat(String value) {
                this.specifyFormat = value;
            }

            /**
             * 获取dateTimeFormat属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDateTimeFormat() {
                return dateTimeFormat;
            }

            /**
             * 设置dateTimeFormat属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateTimeFormat(String value) {
                this.dateTimeFormat = value;
            }

            /**
             * 获取addToResultFilenames属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddToResultFilenames() {
                return addToResultFilenames;
            }

            /**
             * 设置addToResultFilenames属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddToResultFilenames(String value) {
                this.addToResultFilenames = value;
            }

            /**
             * 获取pad属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPad() {
                return pad;
            }

            /**
             * 设置pad属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPad(String value) {
                this.pad = value;
            }

            /**
             * 获取fastDump属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFastDump() {
                return fastDump;
            }

            /**
             * 设置fastDump属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFastDump(String value) {
                this.fastDump = value;
            }

            /**
             * 获取splitevery属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSplitevery() {
                return splitevery;
            }

            /**
             * 设置splitevery属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSplitevery(String value) {
                this.splitevery = value;
            }

        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="xloc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="yloc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="draw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "xloc",
            "yloc",
            "draw"
        })
        public static class GUI {

            protected String xloc;
            protected String yloc;
            protected String draw;

            /**
             * 获取xloc属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXloc() {
                return xloc;
            }

            /**
             * 设置xloc属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXloc(String value) {
                this.xloc = value;
            }

            /**
             * 获取yloc属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getYloc() {
                return yloc;
            }

            /**
             * 设置yloc属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setYloc(String value) {
                this.yloc = value;
            }

            /**
             * 获取draw属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDraw() {
                return draw;
            }

            /**
             * 设置draw属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDraw(String value) {
                this.draw = value;
            }

        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="mongo_field" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="field_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="field_path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="field_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "mongoField"
        })
        public static class MongoFields {

            @XmlElement(name = "mongo_field")
            protected List<Transformation.Step.MongoFields.MongoField> mongoField;

            /**
             * Gets the value of the mongoField property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the mongoField property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMongoField().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Transformation.Step.MongoFields.MongoField }
             * 
             * 
             */
            public List<Transformation.Step.MongoFields.MongoField> getMongoField() {
                if (mongoField == null) {
                    mongoField = new ArrayList<Transformation.Step.MongoFields.MongoField>();
                }
                return this.mongoField;
            }


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="field_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="field_path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="field_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "fieldName",
                "fieldPath",
                "fieldType"
            })
            public static class MongoField {

                @XmlElement(name = "field_name")
                protected String fieldName;
                @XmlElement(name = "field_path")
                protected String fieldPath;
                @XmlElement(name = "field_type")
                protected String fieldType;

                /**
                 * 获取fieldName属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFieldName() {
                    return fieldName;
                }

                /**
                 * 设置fieldName属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFieldName(String value) {
                    this.fieldName = value;
                }

                /**
                 * 获取fieldPath属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFieldPath() {
                    return fieldPath;
                }

                /**
                 * 设置fieldPath属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFieldPath(String value) {
                    this.fieldPath = value;
                }

                /**
                 * 获取fieldType属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFieldType() {
                    return fieldType;
                }

                /**
                 * 设置fieldType属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFieldType(String value) {
                    this.fieldType = value;
                }

            }

        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="schema_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "method",
            "schemaName"
        })
        public static class Partitioning {

            protected String method;
            @XmlElement(name = "schema_name")
            protected String schemaName;

            /**
             * 获取method属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMethod() {
                return method;
            }

            /**
             * 设置method属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMethod(String value) {
                this.method = value;
            }

            /**
             * 获取schemaName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSchemaName() {
                return schemaName;
            }

            /**
             * 设置schemaName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSchemaName(String value) {
                this.schemaName = value;
            }

        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="input" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="output" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "input",
            "output"
        })
        public static class Remotesteps {

            protected String input;
            protected String output;

            /**
             * 获取input属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInput() {
                return input;
            }

            /**
             * 设置input属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInput(String value) {
                this.input = value;
            }

            /**
             * 获取output属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOutput() {
                return output;
            }

            /**
             * 设置output属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOutput(String value) {
                this.output = value;
            }

        }

    }

}
