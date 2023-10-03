import 'package:demo_material_app/botnav.dart';
import 'package:flutter/material.dart';
import 'botnav.dart';

class indexscreen extends StatelessWidget {
  const indexscreen({super.key});


  @override
  Widget build(BuildContext context) {
    return Scaffold(appBar: AppBar(title: const Text("Trang chủ")),
    body: const Text("Index Screen"),
    bottomNavigationBar: const bottomMenu(idx: 0),

    );
  }
}