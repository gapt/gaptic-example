import gapt.expr._
import gapt.proofs.{Context, Sequent}
import gapt.proofs.gaptic._

object example extends TacticsProof {
  ctx += Context.Sort("i")
  ctx += hoc"P: i>o"
  ctx += hoc"Q: i>o"

  val lemma = Lemma(
    ("a" -> fof"P a") +:
    ("b" -> fof"∀x (P x ⊃ Q x)") +:
    Sequent()
    :+ ("c" -> fof"Q a")
  ) {
    chain("b")
    chain("a")
  }
}