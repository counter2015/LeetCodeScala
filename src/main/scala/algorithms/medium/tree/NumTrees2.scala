package algorithms.medium.tree

import algorithms.struct.TreeNode

object NumTrees2 {

  /** RunTime Info:
    * 592 ms , 52.7 MB
    *
    * @param n the nodes of the tree.
    * @return all unique binary search trees.
    */
  def generateTrees(n: Int): List[TreeNode] = {
    def gen(root: Int, leftNodes: List[Int], rightNodes: List[Int]): List[TreeNode] = {

      def genSubTrees(nodes: List[Int]): List[TreeNode] =
        if (nodes.isEmpty) List()
        else if (nodes.length == 1) List(new TreeNode(nodes.head))
        else nodes.flatMap(node => {
          val (left, right) = (nodes.filter(_ < node), nodes.filter(_ > node))
          gen(node, left, right)
        })

      val (leftTrees, rightTrees) = (genSubTrees(leftNodes), genSubTrees(rightNodes))

      (leftTrees, rightTrees) match {
        case (Nil, Nil) => List(new TreeNode(root))
        case (Nil, _) => rightTrees.map(rt => {
          val node = new TreeNode(root)
          node.right = rt
          node
        })
        case (_, Nil) => leftTrees.map(lt => {
          val node = new TreeNode(root)
          node.left = lt
          node
        })
        case (_, _) =>
          for (lt <- leftTrees; rt <- rightTrees) yield {
            val tree = new TreeNode(root)
            tree.left = lt; tree.right = rt
            tree
          }
      }
    }

    (1 to n).toList.flatMap(root => gen(root, (1 to n).toList.filter(_ < root), (1 to n).toList.filter(_ > root)))
  }
}
