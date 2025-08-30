package org.example

class MyUtils implements Serializable {
    def steps
    MyUtils(steps) { this.steps = steps }

    def printDate() {
        steps.echo "📅 Current Date: ${new Date()}"
    }
}