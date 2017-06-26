// src/org/foo/Zot.groovy
package org.foo;

// test
class Zot {
  static def createFile(String filename1) {
    sh: "date > ${filename1}"
  }
}

