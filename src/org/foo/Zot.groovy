// src/org/foo/Zot.groovy
package org.foo;

def createFile(file) {
  sh: "echo thisisit > ${file}"
}
