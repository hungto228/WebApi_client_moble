package com.example.cuahang_client.Model;

public class Server {
 //   public static  String localhost = "apibaitap.conveyor.cloud";
    public static  String localhost = "192.168.43.6:45459/";
    public static  String GetAll = "http://"+localhost+"/CuaHang/GetAll";
    public static  String GetLaptop = "http://"+localhost+"/CuaHang/getSP_Maloai/1";
    public static  String GetPC = "http://"+localhost+"/CuaHang/getSP_Maloai/2";
    public static  String GetNewLap = "http://"+localhost+"/CuaHang/getnewSP/1";
    public static  String GetNewPC = "http://"+localhost+"/CuaHang/getnewSP/2";
    public static  String GetLogin = "http://"+localhost+"/CuaHang/getUser/";
    public static  String UpdateSanPham = "http://"+localhost+"/api/updatesanpham/";
    public static  String PostResgint = "http://"+localhost+"/api/addthanhvien";
    public static  String PostSanPham = "http://"+localhost+"/api/addsanpham";
    public static  String GetSearch = "http://"+localhost+"/server/timkiem.php";
    public static  String Getmaychamcong = "http://"+localhost+"/CuaHang/getSP_ten/Máy chấm công iface 402";
    public static  String GetMayvantay = "http://"+localhost+"/CuaHang/getSP_ten/Máy chấm công vân tay Ronald Jack 5000T-C";

    public static  String GetGia1 = "http://"+localhost+"/CuaHang/getSP_giaMinMax/0/1000000";
    public static  String GetGia2 = "http://"+localhost+"/CuaHang/getSP_giaMinMax/1000000/2000000";
    public static  String GetGia3 = "http://"+localhost+"/CuaHang/getSP_giaMinMax/2000000/3000000";
    public static  String GetGia4 = "http://"+localhost+"/CuaHang/getSP_giaMinMax/3000000/4000000";
    public static  String GetGia5 = "http://"+localhost+"/CuaHang/getSP_giaMinMax/4000000/5000000";
    public static  String GetGia6 = "http://"+localhost+"/CuaHang/getSP_giaMinMax/5000000/1000000000";




    public static  String linkDeleteSp = "http://"+localhost+"api/deletesanpham/";
    public static  String linkchitietdonhang = "http://"+localhost+"/server/linkchitietdonhang.php";
    public static  String linkdonhang = "http://"+localhost+"/server/linkdonhang.php";
    public static  String linkdiachi = "http://"+localhost+"/server/linkdiachi.php";
    public static  String linkthemdiachi = "http://"+localhost+"/server/linkthemdiachi.php";
    public static  String linkDelete = "http://"+localhost+"/server/linkDelete.php";
    public static String getDonHang = "http://"+localhost+"/server/getDonHang.php";
    public static String updateDonHang = "http://"+localhost+"/server/updateDH.php";
    public static String getNguoidung = "http://"+localhost+"/server/getNguoidung.php";

    public static String getHoaDonAdmin = "http://"+localhost+"/CuaHang/get_hoadonAdmin/";

    public static String getDiachi = "http://"+localhost+"/server/timkiemDC.php";

    public static String ketnoi = "http://"+localhost+"/CuaHang/thongkethang/";
    public static String ketnoinam = "http://"+localhost+"/CuaHang/thongkenam/";
    public static String ketnoithang = "http://"+localhost+"/CuaHang/thongkethang/";
}

