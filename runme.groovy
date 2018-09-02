@Grab('ru.curs:xylophone:6.1.3')
import ru.curs.xylophone.XML2Spreadsheet

baseDir = '.'
new File(baseDir, 'testdata.xml').withInputStream {
    input ->
        new File(baseDir, 'report.xlsx').withOutputStream {
            output ->
                XML2Spreadsheet.process(input,
                        new File(baseDir, 'descriptor.xml'),
                        new File(baseDir, 'template.xlsx'),
                        false, output)
        }
}
println 'Done.'
