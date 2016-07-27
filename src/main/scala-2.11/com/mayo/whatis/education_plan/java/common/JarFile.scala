package com.mayo.whatis.education_plan.java.common

import com.mayo.whatis.education_plan.java.abstrct.File

/**
 * @author yoav @since 7/25/16.
 */
trait JarFile extends File{
  override val extention: String = "jar"
}
