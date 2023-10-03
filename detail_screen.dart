

import 'package:demo_material_app/botnav.dart';
import 'package:flutter/material.dart';
import 'botnav.dart';
class detailScreen extends StatelessWidget {
  const detailScreen({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(title:const Text( "Trang chi tiết")  ),
        body: const Text("detailScreen"),
        bottomNavigationBar: bottomMenu(idx: 1),
    );
  }
}