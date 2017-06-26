// src/org/foo/Zot.groovy
package org.foo;

// test
class Zot {
  static def createFile(filename1) {
    sh: "echo thisisit > ${filename1}"
  }
}

