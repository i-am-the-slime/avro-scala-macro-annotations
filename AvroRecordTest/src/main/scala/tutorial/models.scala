package models

import com.julianpeeters.avro.annotations.AvroRecord
import org.apache.avro.Schema
import org.apache.avro.specific.SpecificRecordBase

@AvroRecord
case class A(var i: Int)

@AvroRecord
case class B(var a: Option[A])


