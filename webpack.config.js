var path = require('path');

module.exports = {
    entry: './src/main/js/index.js',
    devtool: 'sourcemaps',
    cache: true,
    mode: 'development',
    output: {
        path: __dirname,
        filename: './src/main/resources/static/built/bundle.js'
    },
    module: {
        rules: [
            {
                test: {and: [path.join(__dirname, '.'), /\.js$/]},
                exclude: /(node_modules)/,
                use: ['babel-loader']
            },
            {
                test: {and: [path.join(__dirname, '.'), /\.css$/]},
                exclude: /(node_modules)/,
                use: ['style-loader', 'css-loader']
            },
            {
                test: {and: [path.join(__dirname, '.'), /\.(png|svg|jpg|gif)$/]},
                exclude: /(node_modules)/,
                use: ['file-loader']
            }
        ]
    }
};