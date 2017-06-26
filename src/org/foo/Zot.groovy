// src/org/foo/Zot.groovy
package org.foo;

// test
// class Zot {
  def createFile(String filename1) {
    sh: "date > ${filename1}"
  }
//}

