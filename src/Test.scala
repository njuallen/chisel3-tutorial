import chisel3._
import chisel3.util._

class Lamp extends Module {
  val io = IO(new Bundle {
    val out = Output(UInt(8.W))
  })
  val s = Reg(init = 1.asUInt(8.W))
  // shift left by one bit
  s := Cat(s(6, 0), s(7, 7))
  io.out := s
}

object Driver extends App {
  chisel3.Driver.execute(args, () => new Lamp)
}
