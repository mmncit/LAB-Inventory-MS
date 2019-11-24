/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.sql.*;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Mamun
 */
public class ServiceHandler {

    public void Purchase_INSERT(String PurchaseID, String Date_purchased, String Itemname, String Brand, String Model, String Description, String Price, String Amount, String Remark) throws SQLException, ClassNotFoundException {
        ConnectionHandler obj = new ConnectionHandler();
        Connection con = obj.getConenction();

        String str;
        str = "BEGIN\nPurchase_INSERT(\'" + PurchaseID + "\',\'" + Date_purchased + "\', \'" + Itemname + "\', \'" + Brand + "\', \'" + Model + "\', \'" + Description + "\', \'" + Price + "\', \'" + Amount + "\', \'" + Remark + "\');\nEND;";
        Statement stm = con.createStatement();
        stm.executeUpdate(str);
    }

    public void Purchase_UPDATE(String PurchaseID, String Date_purchased, String Itemname, String Brand, String Model, String Description, String Price, String Amount, String Remark) throws SQLException, ClassNotFoundException {
        ConnectionHandler obj = new ConnectionHandler();
        Connection con = obj.getConenction();

        String str;
        str = "BEGIN\nPurchase_UPDATE(\'" + PurchaseID + "\',\'" + Date_purchased + "\', \'" + Itemname + "\', \'" + Brand + "\', \'" + Model + "\', \'" + Description + "\', \'" + Price + "\', \'" + Amount + "\', \'" + Remark + "\');\nEND;";
        Statement stm = con.createStatement();
        stm.executeUpdate(str);
    }

    public void Purchase_DELETE(String PurchaseID) throws SQLException, ClassNotFoundException {
        ConnectionHandler obj = new ConnectionHandler();
        Connection con = obj.getConenction();

        String str;
        str = "BEGIN\nPurchase_DELETE(\'" + PurchaseID + "\');\nEND;";
        Statement stm = con.createStatement();
        stm.executeUpdate(str);
    }

    public ResultSet Purchase_ALL() throws ClassNotFoundException, SQLException {
        ConnectionHandler obj = new ConnectionHandler();
        Connection con = obj.getConenction();
        CallableStatement stm;
        stm = con.prepareCall("{? = call Purchase_ALL()}");
        stm.registerOutParameter(1, OracleTypes.CURSOR);
        stm.execute();
        ResultSet ret = (ResultSet) stm.getObject(1);

        return ret;

    }

    public ResultSet Purchase_QUERY(String PurchaseID) throws ClassNotFoundException, SQLException {
        ConnectionHandler obj = new ConnectionHandler();
        Connection con = obj.getConenction();
        CallableStatement stm;
        stm = con.prepareCall("{? = call Purchase_QUERY(?)}");
        stm.registerOutParameter(1, OracleTypes.CURSOR);
        stm.setString(2, PurchaseID);
        stm.execute();
        ResultSet ret = (ResultSet) stm.getObject(1);

        return ret;

    }

    public ResultSet Purchase_DISTINCT_Item_Brand() throws ClassNotFoundException, SQLException {
        ConnectionHandler obj = new ConnectionHandler();
        Connection con = obj.getConenction();
        CallableStatement stm;
        stm = con.prepareCall("{? = call Purchase_DISTINCT_Item_Brand()}");
        stm.registerOutParameter(1, OracleTypes.CURSOR);
        stm.execute();
        ResultSet ret = (ResultSet) stm.getObject(1);

        return ret;

    }

    public void Software_INSERT(String SoftwareID, String Name_of_Software, String Description, String Remark) throws SQLException, ClassNotFoundException {
        ConnectionHandler obj = new ConnectionHandler();
        Connection con = obj.getConenction();

        String str;
        str = "BEGIN\nSoftware_INSERT(\'" + SoftwareID + "\',\'" + Name_of_Software + "\', \'" + Description + "\', \'" + Remark + "\');\nEND;";
        Statement stm = con.createStatement();
        stm.executeUpdate(str);
    }

    public void Software_UPDATE(String SoftwareID, String Name_of_Software, String Description, String Remark) throws SQLException, ClassNotFoundException {
        ConnectionHandler obj = new ConnectionHandler();
        Connection con = obj.getConenction();

        String str;
        str = "BEGIN\nSoftware_UPDATE(\'" + SoftwareID + "\',\'" + Name_of_Software + "\', \'" + Description + "\', \'" + Remark + "\');\nEND;";
        Statement stm = con.createStatement();
        stm.executeUpdate(str);
    }

    public void Software_DELETE(String SoftwareID) throws SQLException, ClassNotFoundException {
        ConnectionHandler obj = new ConnectionHandler();
        Connection con = obj.getConenction();

        String str;
        str = "BEGIN\nSoftware_DELETE(\'" + SoftwareID + "\');\nEND;";
        Statement stm = con.createStatement();
        stm.executeUpdate(str);
    }

    public ResultSet Software_ALL() throws ClassNotFoundException, SQLException {
        ConnectionHandler obj = new ConnectionHandler();
        Connection con = obj.getConenction();
        CallableStatement stm;
        stm = con.prepareCall("{? = call Software_ALL()}");
        stm.registerOutParameter(1, OracleTypes.CURSOR);
        stm.execute();
        ResultSet ret = (ResultSet) stm.getObject(1);

        return ret;

    }

    public ResultSet Software_QUERY(String SoftwareID) throws ClassNotFoundException, SQLException {
        ConnectionHandler obj = new ConnectionHandler();
        Connection con = obj.getConenction();
        CallableStatement stm;
        stm = con.prepareCall("{? = call Software_QUERY(?)}");
        stm.registerOutParameter(1, OracleTypes.CURSOR);
        stm.setString(2, SoftwareID);
        stm.execute();
        ResultSet ret = (ResultSet) stm.getObject(1);

        return ret;

    }

    public void Micro_Computer_INSERT(String PCID, String Date_of_installation, String Name_of_User, String Location, String Remark) throws SQLException, ClassNotFoundException {
        ConnectionHandler obj = new ConnectionHandler();
        Connection con = obj.getConenction();

        String str;
        str = "BEGIN\nMicro_Computer_INSERT(\'" + PCID + "\',\'" + Date_of_installation + "\', \'" + Name_of_User + "\', \'" + Location + "\',\'" + Remark + "\');\nEND;";
        Statement stm = con.createStatement();
        stm.executeUpdate(str);
    }

    public void Micro_Computer_UPDATE(String PCID, String Date_of_installation, String Name_of_User, String Location, String Remark) throws SQLException, ClassNotFoundException {
        ConnectionHandler obj = new ConnectionHandler();
        Connection con = obj.getConenction();

        String str;
        str = "BEGIN\nMicro_Computer_UPDATE(\'" + PCID + "\',\'" + Date_of_installation + "\', \'" + Name_of_User + "\', \'" + Location + "\',\'" + Remark + "\');\nEND;";
        Statement stm = con.createStatement();
        stm.executeUpdate(str);
    }

    public void Micro_Computer_DELETE(String PCID) throws SQLException, ClassNotFoundException {
        ConnectionHandler obj = new ConnectionHandler();
        Connection con = obj.getConenction();

        String str;
        str = "BEGIN\nMicro_Computer_DELETE(\'" + PCID + "\');\nEND;";
        Statement stm = con.createStatement();
        stm.executeUpdate(str);
    }

    public ResultSet Micro_Computer_ALL() throws ClassNotFoundException, SQLException {
        ConnectionHandler obj = new ConnectionHandler();
        Connection con = obj.getConenction();
        CallableStatement stm;
        stm = con.prepareCall("{? = call Micro_Computer_ALL()}");
        stm.registerOutParameter(1, OracleTypes.CURSOR);
        stm.execute();
        ResultSet ret = (ResultSet) stm.getObject(1);

        return ret;

    }

    public ResultSet Micro_Computer_QUERY(String PCID) throws ClassNotFoundException, SQLException {
        ConnectionHandler obj = new ConnectionHandler();
        Connection con = obj.getConenction();
        CallableStatement stm;
        stm = con.prepareCall("{? = call Micro_Computer_QUERY(?)}");
        stm.registerOutParameter(1, OracleTypes.CURSOR);
        stm.setString(2, PCID);
        stm.execute();
        ResultSet ret = (ResultSet) stm.getObject(1);

        return ret;

    }

    public ResultSet Soft_ALL_for_OnePC(String PCID) throws ClassNotFoundException, SQLException {
        ConnectionHandler obj = new ConnectionHandler();
        Connection con = obj.getConenction();
        CallableStatement stm;
        stm = con.prepareCall("{? = call Soft_ALL_for_OnePC(?)}");
        stm.registerOutParameter(1, OracleTypes.CURSOR);
        stm.setString(2, PCID);
        stm.execute();
        ResultSet ret = (ResultSet) stm.getObject(1);

        return ret;

    }

    public ResultSet PC_ALL_for_OneSoft(String SoftID) throws ClassNotFoundException, SQLException {
        ConnectionHandler obj = new ConnectionHandler();
        Connection con = obj.getConenction();
        CallableStatement stm;
        stm = con.prepareCall("{? = call PC_ALL_for_OneSoft(?)}");
        stm.registerOutParameter(1, OracleTypes.CURSOR);
        stm.setString(2, SoftID);
        stm.execute();
        ResultSet ret = (ResultSet) stm.getObject(1);

        return ret;

    }

   
    
    public void Soft_PC_DELETE(String PCID,String SoftwareID) throws SQLException, ClassNotFoundException {
        ConnectionHandler obj = new ConnectionHandler();
        Connection con = obj.getConenction();

        String str;
        str = "BEGIN\nSoft_PC_DELETE(\'"+ PCID +"\',\'"+ SoftwareID +"\');\nEND;";
        Statement stm = con.createStatement();
        stm.executeUpdate(str);
    }

    public void Soft_PC_INSERT(String PCID, String SoftwareID, String DateInstalled) throws SQLException, ClassNotFoundException {
        ConnectionHandler obj = new ConnectionHandler();
        Connection con = obj.getConenction();

        String str;
        str = "BEGIN\nSoft_PC_INSERT(\'" + PCID + "\',\'" + SoftwareID + "\', \'" + DateInstalled + "\');\nEND;";
        Statement stm = con.createStatement();
        stm.executeUpdate(str);
    }
    public ResultSet DISTICT_Item_name_ALL() throws ClassNotFoundException, SQLException {
        ConnectionHandler obj = new ConnectionHandler();
        Connection con = obj.getConenction();
        CallableStatement stm;
        stm = con.prepareCall("{? = call DISTINCT_Item_name_ALL()}");
        stm.registerOutParameter(1, OracleTypes.CURSOR);
        stm.execute();
        ResultSet ret = (ResultSet) stm.getObject(1);

        return ret;

    }
    public ResultSet Free_Hardware_QUERY(String Item)  throws ClassNotFoundException, SQLException {
       ConnectionHandler obj = new ConnectionHandler();
        Connection con = obj.getConenction();
        CallableStatement stm;
        stm = con.prepareCall("{? = call Free_Hardware_QUERY(?)}");
        stm.registerOutParameter(1, OracleTypes.CURSOR);
        stm.setString(2, Item);
        stm.execute();
        ResultSet ret = (ResultSet) stm.getObject(1);

        return ret;


    }
    public ResultSet Hardware_ALL_by_PC_QUERY(String PCID)  throws ClassNotFoundException, SQLException {
       ConnectionHandler obj = new ConnectionHandler();
        Connection con = obj.getConenction();
        CallableStatement stm;
        stm = con.prepareCall("{? = call Hardware_ALL_by_PC_QUERY(?)}");
        stm.registerOutParameter(1, OracleTypes.CURSOR);
        stm.setString(2,PCID);
        stm.execute();
        ResultSet ret = (ResultSet) stm.getObject(1);

        return ret;


    }
    public ResultSet Hardware_QUERY(String HardwareID)  throws ClassNotFoundException, SQLException {
       ConnectionHandler obj = new ConnectionHandler();
        Connection con = obj.getConenction();
        CallableStatement stm;
        stm = con.prepareCall("{? = call Hardware_QUERY(?)}");
        stm.registerOutParameter(1, OracleTypes.CURSOR);
        stm.setString(2,HardwareID);
        stm.execute();
        ResultSet ret = (ResultSet) stm.getObject(1);

        return ret;


    }
    
     public void Hardware_UPDATE(String HardwareID, String PCID,String CurrentStatus) throws SQLException, ClassNotFoundException {
        ConnectionHandler obj = new ConnectionHandler();
        Connection con = obj.getConenction();

        String str;
        str = "BEGIN\nHardware_UPDATE(\'" + HardwareID + "\',\'" + PCID + "\', \'" + CurrentStatus+ "\');\nEND;";
        Statement stm = con.createStatement();
        stm.executeUpdate(str);
    }
      public void Hardware_DELETE(String HardwareID) throws SQLException, ClassNotFoundException {
        ConnectionHandler obj = new ConnectionHandler();
        Connection con = obj.getConenction();

        String str;
        str = "BEGIN\nHardware_DELETE(\'" + HardwareID + "\');\nEND;";
        Statement stm = con.createStatement();
        stm.executeUpdate(str);
    }
      public ResultSet MicroComputers_in_Locations() throws ClassNotFoundException, SQLException {
        ConnectionHandler obj = new ConnectionHandler();
        Connection con = obj.getConenction();
        CallableStatement stm;
        stm = con.prepareCall("{? = call MicroComputers_in_Locations()}");
        stm.registerOutParameter(1, OracleTypes.CURSOR);
        stm.execute();
        ResultSet ret = (ResultSet) stm.getObject(1);

        return ret;

    }
       public ResultSet Items_in_Hardware() throws ClassNotFoundException, SQLException {
        ConnectionHandler obj = new ConnectionHandler();
        Connection con = obj.getConenction();
        CallableStatement stm;
        stm = con.prepareCall("{? = call Items_in_Hardware()}");
        stm.registerOutParameter(1, OracleTypes.CURSOR);
        stm.execute();
        ResultSet ret = (ResultSet) stm.getObject(1);

        return ret;

    }
       public ResultSet ChoicedHardware_in_Locations(String Item)   throws ClassNotFoundException, SQLException {
       ConnectionHandler obj = new ConnectionHandler();
        Connection con = obj.getConenction();
        CallableStatement stm;
        stm = con.prepareCall("{? = call ChoicedHardware_in_Locations(?)}");
        stm.registerOutParameter(1, OracleTypes.CURSOR);
        stm.setString(2, Item);
        stm.execute();
        ResultSet ret = (ResultSet) stm.getObject(1);

        return ret;


    }
       public ResultSet ChoicedHardware_in_Loc_by_PID(String PID)   throws ClassNotFoundException, SQLException {
       ConnectionHandler obj = new ConnectionHandler();
        Connection con = obj.getConenction();
        CallableStatement stm;
        stm = con.prepareCall("{? = call ChoicedHardware_in_Loc_by_PID(?)}");
        stm.registerOutParameter(1, OracleTypes.CURSOR);
        stm.setString(2,PID);
        stm.execute();
        ResultSet ret = (ResultSet) stm.getObject(1);

        return ret;


    }
         public ResultSet Used_Hardware() throws ClassNotFoundException, SQLException {
        ConnectionHandler obj = new ConnectionHandler();
        Connection con = obj.getConenction();
        CallableStatement stm;
        stm = con.prepareCall("{? = call Used_Hardware()}");
        stm.registerOutParameter(1, OracleTypes.CURSOR);
        stm.execute();
        ResultSet ret = (ResultSet) stm.getObject(1);

        return ret;

    }
           public ResultSet Unused_Hardware() throws ClassNotFoundException, SQLException {
        ConnectionHandler obj = new ConnectionHandler();
        Connection con = obj.getConenction();
        CallableStatement stm;
        stm = con.prepareCall("{? = call Unused_Hardware()}");
        stm.registerOutParameter(1, OracleTypes.CURSOR);
        stm.execute();
        ResultSet ret = (ResultSet) stm.getObject(1);

        return ret;

    }
      
}
