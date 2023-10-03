import java.util.*


class ThiSinh{
    //khai báo thuộc tính
    var cccd:String
    var hoTen:String
    var dToan:Float
    var dHoa:Float
    var dLy:Float
    var dVan:Float
    var dAnhVan:Float
    var khoiThi:String

    //khai báo phương thức
    //hàm khởi tạo không truyền tham số
    constructor(){
        cccd=""
        hoTen=""
        dHoa=0f
        dLy=0f
        dAnhVan=0f
        dToan=0f
        dVan=0f
        khoiThi=""
    }

    //hàm khởi tạo truyền tham số
    constructor(cccd:String,hoTen:String,dToan:Float,dHoa:Float,dLy:Float,dVan:Float,dAnhVan:Float,khoiThi:String){
        this.cccd=cccd
        this.khoiThi=khoiThi
        this.dHoa=dHoa
        this.hoTen=hoTen
        this.dToan=dToan
        this.dVan=dVan
        this.dAnhVan=dAnhVan
        this.dLy=dLy
    }

    //nhập thông tin
    fun NhapThongTin(){
        println("Nhập thông tin thí sinh:")
        print("Họ và tên: ")
        hoTen= readln().trim()
        print("CCCD: ")
        cccd= readln().trim()
        print("Khối thi: ")
        khoiThi= readln().trim().uppercase()

        when(khoiThi){
            "A00"->{
                print("Điểm Toán: "); dToan= readln().toFloat()
                print("Điểm Lý: "); dLy= readln().toFloat()
                print("Điểm Hóa: "); dHoa= readln().toFloat()
            }
            "A01"->{
                print("Điểm Toán: "); dToan= readln().toFloat()
                print("Điểm Lý: "); dLy= readln().toFloat()
                print("Điểm Anh Văn: "); dAnhVan= readln().toFloat()
            }
            "D01"->{
                print("Điểm Toán: "); dToan= readln().toFloat()
                print("Điểm Anh Văn: "); dAnhVan= readln().toFloat()
                print("Điểm Văn: "); dVan= readln().toFloat()
            }
        }
    }
    
    //hiện thị thông tin thí sinh
    fun HienThiThongTin(){
        println("Thông tin thí sinh:")
        println("Họ và tên: $hoTen  -  CCCD: $cccd" )
        println("Khối xét tuyển: $khoiThi")
        println("Điểm Toán: $dToan")
        when(khoiThi){
            "A00"->{
                println("Điểm Lý: $dLy")
                println("Điểm Hóa: $dHoa")
                println("Điểm Tổng: ${TongDiem()}")
            }
            "A01"->{
                println("Điểm Lý: $dLy")
                println("Điểm Anh Văn: $dAnhVan")
                println("Điểm Tổng: ${TongDiem()}")
            }
            "D01"->{
                println("Điểm Văn: $dVan")
                println("Điểm Anh Văn: $dAnhVan")
                println("Điểm Tổng: ${TongDiem()}")
            }
        }
        println("----------------------------")
    }

    //Tách họ và tên
    fun TachHoTen():Array<String>{
        var temp:Int=this.hoTen.lastIndexOf(" ")
        return arrayOf(this.hoTen.substring(0,temp),this.hoTen.substring(temp))
   }

    //tổng điểm theo khối thi
    fun TongDiem():Double{
       return when(khoiThi){
           "A00"-> dToan+dLy+dHoa+0.0
           "A01"->dToan+dLy+dAnhVan+0.0
           "D01"->dToan+dVan+dAnhVan+0.0
           else -> 0.0
        }
    }
}
    fun NhapDiemChuan():Map<String,Double>{
        println("Nhập điểm chuẩn")
        var diemChuan= mutableMapOf<String,Double>()
        print("Khối A00: ")
        diemChuan["A00"]= readln().toDouble()
        print("Khối A01: ")
        diemChuan["A01"]= readln().toDouble()
        print("Khối D01: ")
        diemChuan["D01"]= readln().toDouble()

        return diemChuan
    }

fun SapXepHoTen(list:ArrayList<ThiSinh>){
    list.sortedBy { it.hoTen  }
//    Collections.sort(list, Comparator<ThiSinh>(){
//
//    fun compare( sv1:ThiSinh, sv2:ThiSinh):Int{
//        var ht1 =sv1.TachHoTen()
//        var ht2 =sv2.TachHoTen()
//
//        if(ht1[1].compareTo(ht2[1]) ==0)
//            return ht1[0].compareTo(ht2[0])
//        if()
//            return  ht1[1].compareTo(ht2[1])
//    }
//    })
}


fun main() {
    var dsThiSinh:ArrayList<ThiSinh> = ArrayList<ThiSinh>()
    do {
        var thiSinh:ThiSinh= ThiSinh()
        thiSinh.NhapThongTin()
        dsThiSinh.add(thiSinh)

        print("Bạn có muốn nhập tiếp không? Y/N: ")
        if(readln().trim().uppercase()!="Y")
            break
    }while (true)

    println("Danh sách thí sinh: ")
    dsThiSinh.forEach{
        it.HienThiThongTin()
    }

//    println("\nDanh sách thí sinh sau khi sắp xếp: ")
//    SapXepHoTen(dsThiSinh)
//
//    dsThiSinh.forEach{
//        it.HienThiThongTin()
//    }

    var dChuan:Map<String, Double> =NhapDiemChuan()
    println("Danh sách thí sinh trúng tuyển")
    dsThiSinh.forEach{
        when(it.khoiThi){
            "A00"->{ if(it.TongDiem()>= dChuan["A00"]!!)
                it.HienThiThongTin()
            }
            "A01"->{ if(it.TongDiem()>= dChuan["A01"]!!)
                it.HienThiThongTin()
            }
            "D01"->{ if(it.TongDiem()>= dChuan["D01"]!!)
                it.HienThiThongTin()
            }
        }
    }
}