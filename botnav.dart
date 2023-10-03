
import 'package:flutter/material.dart';
import 'detail_screen.dart';
import 'index_screen.dart';

class bottomMenu extends StatelessWidget {
  const bottomMenu({super.key,required this.idx});
    final idx;

  @override
  Widget build(BuildContext context) {
  
    return BottomNavigationBar(
      fixedColor: Colors.blue,
      items: const [
          BottomNavigationBarItem(label:"Trang chủ",
           icon:Icon(Icons.home)),
           BottomNavigationBarItem(label:"Trang chi tiết" ,
           icon:Icon(Icons.add_reaction_sharp)),
      ],
      currentIndex: idx, 
      onTap:(int indexOfItem)
      {
        if(indexOfItem==0)
        {
          Navigator.popUntil(context, (route) => route.isFirst);
          //Navigator.push(context, MaterialPageRoute(builder: (context) => const indexscreen()));
          Navigator.pushNamed(context, '/');
        }
        else
        {
          Navigator.popUntil(context, (route) => route.isFirst);
         // Navigator.push(context, MaterialPageRoute(builder: (context) => const detailScreen()));
         Navigator.pushNamed(context, '/detail');
        }
      }
    );
  }
}