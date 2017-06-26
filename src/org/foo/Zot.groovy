// src/org/foo/Zot.groovy
package org.foo;

// test
class Zot(String filename1) {
  String filename2 = this filename1;
  def createFile(filename2) {
    sh: "echo thisisit > ${filename2}"
  }
}

