package models

import com.julianpeeters.avro.annotations.AvroRecord


@AvroRecord
case class A(var i: Int)

@AvroRecord
case class B(var a: Option[A])


