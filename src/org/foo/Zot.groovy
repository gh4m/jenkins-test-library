// src/org/foo/Zot.groovy
package org.foo;

// test
class Zot(String filename1) {
  def createFile(filename1) {
    sh: "echo thisisit > ${filename1}"
  }
}

