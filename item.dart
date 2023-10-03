import 'package:flutter/material.dart';
import 'package:flutter/src/widgets/framework.dart';
import 'package:flutter/src/widgets/placeholder.dart';

class item extends StatelessWidget {
  const item({super.key,required this.content});
  final String content;

  @override
  Widget build(BuildContext context) {
    return Container(
      margin:const EdgeInsets.all(25),
      padding: const  EdgeInsets.all(20),
      width: (MediaQuery.of(context).size.width-40)/2,
      height: 300,
      alignment: Alignment.topCenter,
      //color:Color.fromARGB(255, 200, 41, 20),
      decoration: BoxDecoration(
        //color có thì decoration ko có
        //Nếu chỉnh phải chỉnh ko decoration
        color:Color.fromARGB(255, 228, 74, 27),
        border: Border.all(color: Color.fromARGB(244, 213, 9, 9),width: 3)),
      child:  Text(content,style: TextStyle(color: Color.fromARGB(255, 241, 241, 4)),),);
    return const Placeholder();
  }
}