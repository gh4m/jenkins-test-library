package org.foo;

def createNewFile(filename1) {
  sh: "date > ${filename1}"
}
