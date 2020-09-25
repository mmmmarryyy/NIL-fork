package io.github.t45k.lvmapper.output

import io.github.t45k.lvmapper.entity.CodeBlock
import java.io.File

class CSV : Format {
    override fun output(fileName: String, clonePairs: List<Pair<Int, Int>>, codeBlocks: List<CodeBlock>) {
        val result = clonePairs.joinToString(System.lineSeparator()) {
            "${reformat(codeBlocks[it.first])},${reformat(codeBlocks[it.second])}"
        }
        File(fileName).writeText(result)
    }

    private fun reformat(codeBlock: CodeBlock): String {
        val (dirName, fileName) = codeBlock.fileName.split(File.separator).let { it[it.size - 2] to it.last() }
        return "$dirName,$fileName,${codeBlock.startLine},${codeBlock.endLine}"
    }
}
