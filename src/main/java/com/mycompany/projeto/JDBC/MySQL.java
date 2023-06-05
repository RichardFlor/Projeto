/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Richard
 */
public class MySQL{
        //Método para estabelecer a conexão com o banco
        public static Connection conector(){
            java.sql.Connection conexao = null;
            //linha abaixo chama o driver
            String driver = "com.mysql.cj.jdbc.Driver";
            //Armazenando informações referente ao banco
            String url = "jdbc:mysql://localhost:3306/Projeto?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "123456789";
           // Estabele conexão com o banco
            try {
                Class.forName(driver);
                conexao = DriverManager.getConnection(url, user, password);
                System.out.println("Banco de dados conectado :)");
                return conexao;
            } catch (Exception e) {
                System.out.println(e);
                return null;
                
            }
            
        }
    }
