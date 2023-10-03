import 'package:demo_material_app/botnav.dart';
import 'package:demo_material_app/detail_screen.dart';
import 'package:flutter/material.dart';
import 'index_screen.dart';
import 'botnav.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});
   

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    
      
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        
        primarySwatch: Colors.blue,
      ),
      darkTheme: ThemeData(primarySwatch: Colors.grey),
      color: Colors.amberAccent,
      supportedLocales: {const Locale('en',' ')},
      debugShowCheckedModeBanner: false,
      initialRoute: '/',
      routes: {
        '/':(context)=> const indexscreen(),
        '/detail':(context) => const detailScreen(),
      },
      //home: indexscreen()
    );
    
  }
}

